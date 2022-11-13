package Mid;
/*https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/*/
public class movingCount {
    public static int movingCount(int m, int n, int k) {
        boolean[][] visited=new boolean[m][n];
        return dfs(0,0,m,n,k,visited);
    }

    public static int dfs(int i,int j,int m,int n,int k,boolean[][] visited){
        if(i<0||i>=m||j<0||j>=n||visited[i][j]||getcounts(i,j)>k)
            return 0;
        visited[i][j]=true;
        int maxsteps = dfs(i + 1, j, m, n, k, visited)+dfs(i, j + 1, m, n, k, visited);
        return maxsteps+1;
    }

    public static int getcounts(int i,int j){
        int counts=0;
        while(i/10>0){
            counts+=i%10;
            i=i/10;
        }
        counts+=i;
        while(j/10>0){
            counts+=j%10;
            j=j/10;
        }
        counts+=j;
        return counts;
    }
}
