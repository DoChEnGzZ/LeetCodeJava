package hard;

import java.util.LinkedList;
import java.util.Queue;

/*https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/*/
public class Codec {

//    public static void main(String[] args) {
//        Codec codec=new Codec();
//        TreeNode root=new TreeNode(5);
//        TreeNode node1=new TreeNode(2);
//        TreeNode node2=new TreeNode(3);
//        TreeNode node3=new TreeNode(2);
//        TreeNode node4=new TreeNode(4);
//        TreeNode node5=new TreeNode(3);
//        TreeNode node6=new TreeNode(1);
//        root.left=node1;
//        root.right=node2;
//        node2.left=node3;
//        node2.right=node4;
//        node4.left=node5;
//        node4.right=node6;
//        codec.deserialize(codec.serialize(root));
//
//    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "";
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        StringBuilder res= new StringBuilder();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()){
            TreeNode node=treeNodeQueue.poll();
            if(node!=null) {
                res.append(node.val).append(",");
                treeNodeQueue.offer(node.left);
                treeNodeQueue.offer(node.right);
            }
            else
            {
                res.append("n,");
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")
            return null;
        String[] idata=data.substring(0,data.length()-1).split(",");
        TreeNode root=new TreeNode(Integer.parseInt(idata[0]));
        recur(idata,0,root);
        return root;
    }

    //index is the position of current node to build
    public void recur(String[] data,int index,TreeNode node){

        if(2*index+1>= data.length||data[index].equals("n"))
            return;
        //为叶子结点
        if(data[(2*index+1)].equals("n")&&data[(2*index+2)].equals("n"))
            return;
        if(!data[(2*index+1)].equals("n" ))
        {
            TreeNode left=new TreeNode(Integer.parseInt(data[(2*index+1)]));
            node.left=left;
            recur(data,2*index+1,left);
        }
        if(!data[(2*index+2)].equals("n"))
        {
            TreeNode right=new TreeNode(Integer.parseInt(data[(2*index+2)]));
            node.right=right;
            recur(data,2*index+2,right);
        }
    }
}
