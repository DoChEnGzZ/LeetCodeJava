package hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/*/
public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)
            return new int[0];
        //dp[i]表示在nums中以i为开始的长度为k的切片的最大值
        int[] dp=new int[nums.length-k+1];
        Deque<Integer> prique=new LinkedList<>();
        //i为滑动窗口的前端，j为滑动窗口的后端。
        for(int i=1-k,j=0;j<nums.length;j++,i++){
            if(i>0&&prique.peekFirst()==nums[i-1]){
                prique.removeFirst();
            }
            while(!prique.isEmpty()&&prique.peekLast()<nums[j]){
                prique.removeLast();
            }
            prique.addLast(nums[j]);
            if(i>=0)
                dp[i]=prique.peekFirst();
        }
        return dp;
    }
}
