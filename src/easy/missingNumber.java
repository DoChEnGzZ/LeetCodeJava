package easy;

/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class missingNumber {
    public static int missingNumber(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(j>=i)
        {
            int m=(i+j)/2;
            if(nums[m]<=m)
                i=m+1;
            else
                j=m-1;
        }
        return i;
    }
}
