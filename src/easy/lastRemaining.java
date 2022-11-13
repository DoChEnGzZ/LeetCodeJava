package easy;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/*/
public class lastRemaining {
    public int lastRemaining(int n, int m) {
        List<Integer> nums=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            nums.add(i);
        }
        int ldn=0;
        while(nums.size()!=1){
            ldn=(ldn+m-1)% nums.size();
            nums.remove(ldn);
        }
        return nums.get(0);
    }
}
