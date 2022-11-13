package Mid;
/*https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/*/
public class kthLargest {
    int count,res=0;
    public int kthLargest(TreeNode root, int k) {
        count=k;
        dfs(root);
        return res;

    }

    public void dfs(TreeNode root){
        if(root==null||count==0)
            return;
        dfs(root.right);
        if(--count==0)
            res= root.val;
        dfs(root.left);
    }
}
