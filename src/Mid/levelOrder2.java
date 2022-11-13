package Mid;


import java.util.*;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 */
public class levelOrder2 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> nodeQueue=new ArrayDeque<>();
        List<List<Integer>> result=new ArrayList<>();
        int count=1;
        if(root==null)
            return result;
        else{
            nodeQueue.offer(root);
            while(!nodeQueue.isEmpty()){
                List<Integer> list_left=new ArrayList<>();
                //奇数层，first出last入，从左子树向右子树入队
                for (int i = nodeQueue.size(); i > 0; i--) {
                    TreeNode node=nodeQueue.pollFirst();
                    if (node.left != null) {
                        nodeQueue.offerLast(node.left);
                    }
                    if (node.right != null) {
                        nodeQueue.offerLast(node.right);
                    }
                    list_left.add(node.val);
                }
                result.add(list_left);
                if(nodeQueue.isEmpty())
                    break;
                List<Integer> list_right=new ArrayList<>();
                //偶数层，first出last入，从右子树向左子树入队
                for(int i=nodeQueue.size();i>0;i--){
                    TreeNode node=nodeQueue.pollLast();
                    if (node.right != null) {
                        nodeQueue.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        nodeQueue.offerFirst(node.left);
                    }
                    list_right.add(node.val);
                }
                result.add(list_right);
                //倒置list实现逆转
//                if (count % 2 == 1) {
//                    result.add(list);
//                } else {
//                    Collections.reverse(list);
//                    result.add(list);
//                }
//                count++;
            }
        }
        return result;
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
