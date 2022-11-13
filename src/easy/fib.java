package easy;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
public class fib {
    public int fib(int n) {
        if(n<2)
            return n;
        else{
            int a=0,b=1,sum=0;
            for(int i=1;i<n;i++)
            {
                sum= (int) ((a+b)%(1e9+7));
                a=b;
                b=sum;
            }
            return sum;
        }
    }

}
