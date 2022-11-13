package Mid;

/*https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/*/
public class myPow2 {


    public double myPow(double x, int n) {
        long y=n;
        if(n>=0)
            return quickMul(x,y);
        else
            return 1/quickMul(x,-y);
    }

    double quickMul(double x, long n) {
        if(n==0)
            return 1;
        if (n == 1 )
            return x;
        double temp = quickMul(x, n / 2);
        //正次幂
        if (n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * x;
    }
}
