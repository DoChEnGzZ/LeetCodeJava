package easy;

/*https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/*/
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int i=0,j=nums.length-1;
        while(j>i){
            if(target-nums[i]==nums[j])
            {
                result[0]=nums[i];
                result[1]=nums[j];
                return result;
            }
            else if(target-nums[i]>nums[j])
                i++;
            else
                j--;
        }
        return result;
    }
}
