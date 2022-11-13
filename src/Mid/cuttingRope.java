package Mid;
/*https://leetcode-cn.com/problems/jian-sheng-zi-lcof/*/
public class cuttingRope {
    public int cuttingRope(int n) {
        //动态规划，dp[n]为长度为n的绳子的剪乘最大值
        int[] dp=new int[n+1];
        //最初始的情况长度为2的绳最大值为1
        dp[2]=1;
        //从长度为3开始遍历
        for(int i=3;i<n+1;i++){
            //遍历剪一刀的位置，此时绳剪为|1 2 3 ... |j j+1 ...i|,j可以从2到i
            for(int j=2;j<i;j++){
                //dp[i]的最大值为不剪j这一刀，即还为dp[i]
                // 只剪一刀将i分为两端，最大值为j*(i-j)
                // 剪完j之后，还考虑将剩余长度i-j的动态规划结果，最大值为j*dp[i-j]
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
