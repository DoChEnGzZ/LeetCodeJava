package easy;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/*/
public class majorityElement {


    public int majorityElement(int[] nums) {
//        HashMap<Integer,Integer> numscount=new HashMap<>();
//        int majornum=0,maxcount=0,length=nums.length;
//        for(int num:nums){
//            if(!numscount.containsKey(num)){
//                numscount.put(num,1);
//            }
//            else {
//                numscount.put(num,numscount.get(num)+1);
//            }
//            if(numscount.get(num)>maxcount){
//                maxcount=numscount.get(num);
//                majornum=num;
//            }
//            if(maxcount>length/2)
//                break;
//        }
//        return majornum;
        quicksort(nums,0,nums.length-1);
        return nums[nums.length/2];
    }

    public void quicksort(int[] nums,int low,int high){
        if(low>=high)
            return;
        int i=low,j=high,p=nums[i];
        while(i<j){
            while(nums[j]>=p&&j>i)
                j--;
            while(nums[i]<=p&&j>i)
                i++;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        nums[low]=nums[i];
        nums[i]=p;
        quicksort(nums,low,i-1);
        quicksort(nums,i+1,high);
    }
}
