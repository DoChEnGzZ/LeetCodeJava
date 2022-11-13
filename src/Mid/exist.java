package Mid;
/*https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/*/
public class exist {
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++){
                boolean[][] visted=new boolean[board.length][board[0].length];
                if(dfs(board,word,0,i,j,visted))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board,String word,int k,int i,int j,boolean[][] visited){
        if(i>board.length-1||i<0||j>board[0].length-1||j<0||board[i][j]!=word.charAt(k)||visited[i][j]==true)
            return false;
        //递归结束
        else if(k==word.length()-1)
            return true;
        //能运行到这里说明找到了下一个点了，ij符合要求
        visited[i][j]=true;
        boolean res=dfs(board,word,k+1,i,j+1,visited)||dfs(board,word,k+1,i,j-1,visited)||
                dfs(board,word,k+1,i-1,j,visited)||dfs(board,word,k+1,i+1,j,visited);
        visited[i][j]=false;
        return res;
    }
}

