package Mid;

/*https://leetcode-cn.com/problems/qiu-12n-lcof/*/
public class sumNums {

    public sumNums() {
    }

    public int sumNums(int n) {
//        int res;
//        boolean b = n > 1 && (res = sumNums(n - 1)) > 0||((res=0)>0);
//        return n+res;
        return (int)(Math.pow(n,2)+n)>>1;
    }
}
