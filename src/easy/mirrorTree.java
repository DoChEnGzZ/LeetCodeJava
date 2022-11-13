package easy;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 */
public class mirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode newroot=new TreeNode(root.val);
        if (root.left != null) {
            newroot.right = mirrorTree(root.left);
        }
        if (root.right != null) {
            newroot.left = mirrorTree(root.right);
        }
        return newroot;
    }
}
