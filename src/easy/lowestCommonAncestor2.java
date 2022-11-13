package easy;

import java.util.*;

/*https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/*/
public class lowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null)
//            return null;
//        if(p==root||q==root)
//            return root;
//        TreeNode left=lowestCommonAncestor(root.left,p,q);
//        TreeNode right=lowestCommonAncestor(root.right,p,q);
//        if(left==right&&left==null)
//            return null;
//        if(left==null)
//            return right;
//        else if(right==null)
//            return left;
//        else
//            return root;
        List<TreeNode> path1=new ArrayList<>();
        List<TreeNode> path2=new ArrayList<>();
        GetPath(root,p,path1);
        GetPath(root,q,path2);
        TreeNode res=null;
        for(int i=0;i<Math.max(path1.size(),path2.size());i++){
            if(path1.get(i)==path2.get(i))
                res=path1.get(i);
        }
        return res;
    }

    void GetPath(TreeNode root, TreeNode node, List<TreeNode> path){
        if(root==null)
            return;
        path.add(root);
        if(root==node){
            return;
        }
        if(path.get(path.size()-1)!=node){
            GetPath(root.left,node,path);
        }
        if(path.get(path.size()-1)!=node){
            GetPath(root.right,node,path);
        }
        if(path.get(path.size()-1)!=node){
            path.remove(path.size()-1);
        }
    }
}
