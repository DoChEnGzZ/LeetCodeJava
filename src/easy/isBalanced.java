package easy;

/*https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/*/
public class isBalanced {
    //深度遍历自低向上判断
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    //求树的高度的函数，但是额外加上判断以root为根的左右子树的高度是否相差1一下
    public int recur(TreeNode root){
        if(root==null)
            return 0;
        int left=recur(root.left);
        if(left==-1)
            return left;
        int right=recur(root.right);
        if(right==-1)
            return right;
        return Math.abs(left-right)>=2?-1:Math.max(left,right)+1;

    }
}
