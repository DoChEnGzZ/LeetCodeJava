package easy;
/*https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/*/
public class isStraight {
    public static boolean isStraight(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        int zerocount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zerocount++;
            }
            else if(nums[i]==nums[i+1]&&nums[i]!=0)
                return false;
        }
        return nums[4] - nums[zerocount]<5;
    }

   public static void  quicksort(int[] nums,int low,int high){
        if(low>=high)
            return;
        int i=low,j=high;
        int anchor=nums[low];
        while(i<j)
        {
            while(nums[j]>=anchor&&j>i)
                j--;
            while(nums[i]<=anchor&&j>i)
                i++;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        nums[low]=nums[i];
        nums[i]=anchor;
        quicksort(nums,low,i-1);
        quicksort(nums,i+1,high);
    }

}
