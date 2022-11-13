package Mid;
/* https://leetcode-cn.com/problems/powx-n/ */
public class myPow {
    public double myPow(double x,int y){
        long n=y;
        if(n>0)
        {
            return quickMul(x,n);
        }
        else
            return 1/quickMul(x,n);
    }
    public double quickMul(double x,long y){
        if(y==0)
        {
            return 1;
        }
        double temp=quickMul(x,y/2);
        if(y%2==0)
        {
            return temp*temp;
        }
        else
            return temp*temp*x;
    }
}
