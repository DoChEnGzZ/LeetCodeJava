package Mid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */
public class levelOrder {
    public int[] levelOrder(TreeNode root) {
        //层序遍历二叉树
        if(root==null)
            return new int[0];
        Queue<TreeNode> nodeQueue= new LinkedList<>();
        nodeQueue.offer(root);
        List<Integer> result= new ArrayList<>();
        while(!nodeQueue.isEmpty()){
            if(nodeQueue.peek().left!=null){
                nodeQueue.offer(nodeQueue.peek().left);
            }
            if(nodeQueue.peek().right!=null){
                nodeQueue.offer((nodeQueue.peek().right));
            }
            result.add(nodeQueue.poll().val);
        }
        int[] print=new int[result.size()];
        for(int i=0;i<result.size();i++){
            print[i]=result.get(i);
        }
        return print;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
