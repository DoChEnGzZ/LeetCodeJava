package easy;

/*https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/*/
public class maxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
