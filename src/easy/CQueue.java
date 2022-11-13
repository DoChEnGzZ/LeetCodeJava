package easy;
/*https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/*/
import java.util.List;
import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty())
        {
            return stack2.pop();
        }
        else{
            if(stack1.isEmpty())
            {
                return -1;
            }
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
