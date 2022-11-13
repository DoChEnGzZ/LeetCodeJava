package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/*/
public class findContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res=new ArrayList<>();
        int i=1,j=2,sum=3;
        while(j>i){
            sum=(j+i)*(j-i+1)/2;
            if(sum==target)
            {
                int[] ans=new int[j-i+1];
                for(int k=0;k<ans.length;k++){
                    ans[k]=i+k;
                }
                res.add(ans);
                i++;
            }
            else if(sum<target)
                j++;
            else
                i++;
        }
        return res.toArray(new int[0][]);
    }
}
