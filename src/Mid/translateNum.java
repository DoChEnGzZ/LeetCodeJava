package Mid;

/**
 * https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 */

public class translateNum {
    public int translateNum(int num) {
        if(num/10==0){
            return 1;
        }
        else if(num/26==0){
            return 2;
        }
        else if(num%100<=25&&num%100>9)
            return translateNum(num/10)+translateNum(num/100);
        else
            return translateNum(num/10);
    }
}
