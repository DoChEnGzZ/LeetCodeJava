package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/*/
public class spiralOrder {
    List<Integer> res=new ArrayList<>();

    public static void main(String[] args) {

        spiralOrder spiralOrder=new spiralOrder();
        int[][] a={{3},{2}};
        spiralOrder.spiralOrder(a);
    }
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)
            return new int[0];
        recur(matrix,0,0,matrix[0].length,matrix.length);
        int []resarray=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            resarray[i]=res.get(i);
        }
        return resarray;
    }

    public void recur(int[][] matrix,int i,int j,int l,int d){
        if(l<1||d<1) {
            return;
        }
        res.add(matrix[i][j]);
        for(int m=j+1;m<j+l;m++)
            res.add(matrix[i][m]);
        for(int m=i+1;m<i+d;m++)
            res.add(matrix[m][j+l-1]);
        for(int m=j+l-2;m>j;m--)
            res.add(matrix[i+d-1][m]);
        for(int m=i+d-1;m>i;m--)
            res.add(matrix[m][j]);
        recur(matrix,i+1,j+1,l-2,d-2);
    }
}
