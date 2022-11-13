package easy;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        //dp数组的每个元素代表以其下标号结尾的子数组的最大和，本题使用动态规划方法
        int[] dp=new int[nums.length];
        int maxsum=nums[0];
        if(nums.length==0)
            return 0;
        else{
            dp[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
                maxsum=Math.max(dp[i],maxsum);
            }
        }
        return maxsum;
    }
}
