package easy;

/**
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else if(root.left==null&&root.right==null)
            return true;
        else
            return isSame(getMirror(root.left), root.right);
    }

    public TreeNode getMirror(TreeNode root){
        if(root==null)
            return null;
        TreeNode newroot=new TreeNode(root.val);
        if (root.left != null) {
            newroot.right = getMirror(root.left);
        }
        if (root.right != null) {
            newroot.left = getMirror(root.right);
        }
        return newroot;
    }

    public boolean isSame(TreeNode a,TreeNode b){
        if(a==null&&b==null)
            return true;
        else if(a==null&&b!=null)
            return false;
        else if(a!=null&&b==null)
            return false;
        else if(a.val!= b.val)
            return false;
        else return isSame(a.left,b.left)&&isSame(a.right,b.right);
    }
}
