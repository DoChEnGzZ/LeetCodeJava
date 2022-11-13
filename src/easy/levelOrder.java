package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */
public class levelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodeQueue= new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        else{
            nodeQueue.offer(root);
            while(!nodeQueue.isEmpty()){
                List<Integer> list=new ArrayList<>();
                for (int i = nodeQueue.size(); i > 0; i--) {
                    if (nodeQueue.peek().left != null) {
                        nodeQueue.offer(nodeQueue.peek().left);
                    }
                    if (nodeQueue.peek().right != null) {
                        nodeQueue.offer(nodeQueue.peek().right);
                    }
                    list.add(nodeQueue.poll().val);
                }
                result.add(list);
            }
        }
        return result;
    }

    public  class TreeNode{
        int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
