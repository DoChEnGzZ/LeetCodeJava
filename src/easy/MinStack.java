package easy;

import java.util.List;
import java.util.Stack;

/*
https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
*/
public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> mystack;
    Stack<Integer> Descstack;
    public MinStack() {
        mystack=new Stack<>();
        Descstack=new Stack<>();
    }

    public void push(int x) {
        mystack.push(x);
        if(Descstack.isEmpty())
        {
            Descstack.push(x);
        }
        else{
            if(Descstack.peek()>=x){
                Descstack.push(x);
            }
        }
    }

    public void pop() {
        int temp=mystack.pop();
        if(Descstack.peek()==temp)
        {
            Descstack.pop();
        }
    }

    public int top() {
        return mystack.peek();
    }

    public int min() {
        return Descstack.peek();
    }
}
