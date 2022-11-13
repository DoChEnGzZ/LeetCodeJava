package Mid;

/**
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */
public class isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null||A==null){
            return false;
        }else{
            if(isSame(A,B))
                return true;
            else return isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }
    }

    public boolean isSame(TreeNode A,TreeNode B){
        if(B==null)
            return true;
        if(A==null||A.val!= B.val)
            return false;
        else return isSame(A.left,B.left)&&isSame(A.right,B.right);
    }

    public static class TreeNode{
        int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
