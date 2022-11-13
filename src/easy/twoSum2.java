package easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*https://leetcode.cn/problems/two-sum/?favorite=2cktkvj*/
public class twoSum2 {
    public int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hashtable.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=hashtable.get(target-nums[i]);
                return res;
            }
            hashtable.put(nums[i],i);
        }
        return res;
    }


}
