package Mid;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/*/
public class MaxQueue {
//    PriorityQueue<Integer> priorityQueue;
    Queue<Integer> queue;
    Deque<Integer> deque;
    public MaxQueue() {
//        priorityQueue=new PriorityQueue<>((x,y)->y-x);
        deque=new LinkedList<>();
        queue=new LinkedList<>();
    }

    public int max_value() {
//        if(!priorityQueue.isEmpty())
//            return priorityQueue.peek();
        return deque.isEmpty()?-1:deque.peekFirst();
    }

    public void push_back(int value) {
//        priorityQueue.add(value);
        if(deque.isEmpty())
            deque.offerFirst(value);
        else {
            while(deque.peekLast()<value)
                deque.pollLast();
            deque.offerLast(value);
        }
        queue.add(value);
    }

    public int pop_front() {
        if(queue.isEmpty())
            return -1;
        int temp=queue.remove();
        if(deque.peekFirst()==temp)
            deque.pollFirst();
//        priorityQueue.remove(temp);
        return temp;
    }
}
