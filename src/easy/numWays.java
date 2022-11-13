package easy;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */
public class numWays {
    public int numWays(int n) {
        if(n==0)
            return 1;
        if(n<2)
            return n;
        else{
            int[] ways=new int[n+1];
            ways[1]=1;
            ways[2]=2;
            for(int i=3;i<=n;i++){
                ways[i]= (int) ((ways[i-1]+ways[i-2])%(1e9+7));
            }
            return ways[n];
        }
    }
}
