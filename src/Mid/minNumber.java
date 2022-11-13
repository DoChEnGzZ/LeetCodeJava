package Mid;

import java.util.HashMap;

/*https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/*/
public class minNumber {
    public static String minNumber(int[] nums) {
        String res="";
        String[] convert = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            convert[i]=String.valueOf(nums[i]);
        }
        quicksort(convert,0,convert.length-1);
        for(String s:convert)
            res+=s;
        return res;
    }

    public static void quicksort(String[] nums,int i,int j){
        if(i>=j)
            return;
        String anchor=nums[i];
        int low=i,high=j;
        while(high>low){
            while((nums[high]+anchor).compareTo(anchor+nums[high])>=0&&high>low)
                high--;
            while((nums[low]+anchor).compareTo(anchor+nums[low])<=0&&high>low)
                low++;
            if(high>low){
                String cmp=nums[low];
                nums[low]=nums[high];
                nums[high]=cmp;
            }
        }
        nums[i]=nums[low];
        nums[low]=anchor;
        quicksort(nums,i,low-1);
        quicksort(nums,low+1,j);
    }

    public static void quickSort(String[] strs, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while(i < j) {
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }

}
