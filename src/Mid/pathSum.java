package Mid;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/*/
//后序遍历二叉树--失败
//先序遍历二叉树
public class pathSum {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        TreeNode lastnode=root;
        stack.add(node);
        path.add(node.val);
        while(node!=null&&!stack.isEmpty()){
            while(node.left!=null&&target>0&&node.left!=lastnode){
                node=node.left;
                stack.push(node);
                path.add(node.val);
                target-=node.val;
            }
            if(target==0&&node.left==null&&node.right==null) {
                result.add(new LinkedList<>(path));
            }
            lastnode=stack.pop();
            path.remove(path.size()-1);
            target+= lastnode.val;

        }
//        recur(root,target);
        return result;
    }

    public void recur(TreeNode node,int target)
    {
        if (node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            result.add(new LinkedList<>(path));
        }
        recur(node.left, target);
        recur(node.right, target);
        path.remove(path.size() - 1);
    }
}
