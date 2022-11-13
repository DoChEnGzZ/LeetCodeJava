package easy;
/*https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/*/
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node= root;
        while(node!=null)
        {
            if(node.val>p.val&&node.val>q.val){
                node=node.left;
            }
            else if(node.val<p.val&&node.val< q.val)
                node=node.right;
            else
                break;
        }
        return node;
    }
}
