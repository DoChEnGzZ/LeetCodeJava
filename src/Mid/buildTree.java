package Mid;

import java.util.Arrays;

/*https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/*/
public class buildTree {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        TreeNode node=new TreeNode(preorder[0]);
        if(preorder.length!=1&&inorder.length!=1){
            int i=0;
            while(inorder[i]!=node.val){
                i++;
            }
            int[] inorder_leftnodes=Arrays.copyOfRange(inorder,0,i);
            int[] inorder_rightnodes=Arrays.copyOfRange(inorder,i+1,inorder.length);
            int[] preorder_leftnodes=Arrays.copyOfRange(preorder,1,inorder_leftnodes.length+1);
            int[] preorder_rightnodes=Arrays.copyOfRange(preorder,inorder_leftnodes.length+1,preorder.length);
            node.left=buildTree(preorder_leftnodes,inorder_leftnodes);
            node.right=buildTree(preorder_rightnodes,inorder_rightnodes);
        }
        return node;
    }
}
