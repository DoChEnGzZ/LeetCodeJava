package easy;
/*https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/*/
public class hammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;
//        while(n!=0){
//            count+=n&1;
//            n=n>>>1;
//        }
//        return count;
        int res;
        while(n!=0){
            res=n&(n-1);
            if(n!=res)
                count++;
            n=res;
        }
        return count;
    }
}
