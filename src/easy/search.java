package easy;

/**
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class search {
    public static int search(int[] nums, int target) {
//        int count=0;
//        int i=0;
//        for(int num:nums){
//            if(num==target){
//                while(nums[i]==target){
//                    count++;
//                    i++;
//                    if(i>=nums.length)
//                        break;
//                }
//                return count;
//            }
//            i++;
//        }
//        return 0;
        //二分查找，寻找右边界
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int m=(i+j)/2;
            if(nums[m]>target)
                j=m-1;
            else
                i=m+1;
        }
        int right=i;
        if(j>=0&&nums[j]!=target)
            return 0;
        //寻找左边界
        i=0;
        j=nums.length-1;
        while(i<=j)
        {
            int m=(i+j)/2;
            if(nums[m]>=target)
                j=m-1;
            else
                i=m+1;
        }
        return right-j-1;
    }

}
