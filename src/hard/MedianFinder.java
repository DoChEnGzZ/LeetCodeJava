package hard;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/*/
public class MedianFinder {



    /** initialize your data structure here. */
    Queue<Integer>A,B;
    public MedianFinder() {
        //A为小顶堆，保存较大的一半
        A=new PriorityQueue<>();
        //B为大顶堆，保存较小的一般
//        B=new PriorityQueue<>((x,y)->(y-x));
        B=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }

    public void addNum(int num) {
        if(A.size()== B.size()){
            A.add(num);
            B.add(A.poll());
        }
        else{
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size()==B.size()?(A.peek()+ B.peek())/2.0:B.peek();
    }
}
