package Mid;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 */
public class maxProfit {
    public static int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        if(prices.length==0||prices.length==1)
            return 0;
        else{
            dp[0]=0;
            int lowestprice=prices[0];
            for(int i=1;i<prices.length;i++){
                if(dp[i-1]>prices[i]-lowestprice)
                    dp[i]=dp[i-1];
                else
                    dp[i]=prices[i]-lowestprice;
                if(prices[i]<lowestprice)
                    lowestprice=prices[i];
            }
        }
        return dp[prices.length-1];

    }
}
