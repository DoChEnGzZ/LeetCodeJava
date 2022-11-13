package easy;
/*https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/*/
public class add {
    public int add(int a, int b) {
        int c=0;
        while(b!=0){
            c=(a&b)<<1;
            a=a^b;
            b=c;
        }
        return b;
    }
}
