package Mid;

import java.util.Stack;

/*https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/*/
public class validateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length==0&&popped.length==0)
            return true;
        Stack<Integer> simulation_stack=new Stack<>();
        int pushptr=0,popptr=0;
        simulation_stack.push(pushed[pushptr++]);
        while(popptr<popped.length||pushptr<pushed.length){
            while(!simulation_stack.isEmpty()&&simulation_stack.peek()==popped[popptr])
            {
                    popptr++;
                    simulation_stack.pop();
            }
            if (pushptr == pushed.length)
                    break;
            simulation_stack.push(pushed[pushptr++]);
        }
        return simulation_stack.isEmpty();
    }
}
