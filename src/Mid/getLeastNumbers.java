package Mid;
/*https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/*/
public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        quicksort(arr,0,arr.length-1);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=arr[i];
        }
        return result;
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
