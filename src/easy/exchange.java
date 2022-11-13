package easy;
/*https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/*/
public class exchange {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        while(j>i){
            while(nums[i]%2!=0&&i<j)
                i++;
            while(nums[j]%2==0&&i<j)
                j--;
            if(j>=i){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}
