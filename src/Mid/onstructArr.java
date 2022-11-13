package Mid;

import java.awt.event.ItemEvent;

/*https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/*/
public class onstructArr {


    public int[] constructArr(int[] a) {
        int[] res=new int[a.length];
        int tmp=1;
        for(int i=0;i<a.length;i++){
            res[i]=tmp;
            tmp=a[i]*res[i];
        }
        for(int i = a.length-1,temp=1;i>=0;i--){
            res[i]*=temp;
            temp*=a[i];
        }
        return res;
    }
}
