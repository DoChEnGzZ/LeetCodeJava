package easy;

import java.util.HashSet;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class findRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
//        int[] count=new int[nums.length];
//        for(int n:nums){
//            if(count[n]==1)
//                return n;
//            else
//                count[n]=1;
//        }
//        return -1;
        HashSet<Integer> set=new HashSet<Integer>();
        int repeat=-1;
        for(int num:nums){
            if(!set.add(num)){
                repeat=num;
            }
        }
        return repeat;
    }
}
