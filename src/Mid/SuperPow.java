package Mid;
/*
https://leetcode-cn.com/problems/super-pow/
* */
public class SuperPow {
    public long superPow(int a, int[] b) {
        final int Mod=1337;
        return dfs(a,b,b.length-1);
    }
    public long dfs(int a,int[] b,int pos){
        if(pos==-1)
        {
            return 1;
        }
        else
            return quickMul(a,b[pos])*quickMul(dfs(a,b,pos-1),10)%1337;
    }
    /*快速幂*/
    public long quickMul(long a,long b){
        if(a==1||a==0){
            return a;
        }
        if(b==0){
            return 1;
        }
        long temp=quickMul(a,b/2);
        return b%2==0?temp*temp:temp*temp*a;
    }
}
