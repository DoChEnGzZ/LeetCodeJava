package Mid;

/**
 * https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 */
public class maxValue {
    public static int maxValue(int[][] grid) {
        int m=grid[0].length,n=grid.length;
        if(m==1&&n==1)
            return grid[0][0];
        int dp[][]=new int[n][m];
        dp[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                if(i>=1&&j>=1)
                {
                    dp[i][j]=Math.max(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
                }
                else if(i>=1&&j<1){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else if(i<1&&j>=1){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
