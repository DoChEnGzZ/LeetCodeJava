package Mid;

import java.util.Stack;

/*https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/*/
public class treeToDoublyList {

    public Node treeToDoublyList(Node root) {
//        pre=null;
//        if(root==null)
//            return null;
//        dfs(root);
//        head.left=pre;
//        pre.right=head;
//        return head;
        Node pre = null,head = null,cur=null;
        Stack<Node> nodeStack=new Stack<>();
        nodeStack.push(root);
        cur=root;
        while(!nodeStack.isEmpty()||cur!=null){
            while(cur!=null)
            {
                cur=cur.left;
                nodeStack.push(cur);
            }
            if(!nodeStack.isEmpty()){
                cur=nodeStack.pop();
                if(pre==null)
                    head=cur;
                else {
                    pre.right = cur;
                    cur.left = pre;
                    cur = cur.right;
                }
                pre = cur;
            }
        }
        return head;
    }
//
//    public void dfs(Node root){
//        Node pre;
//        if(root==null)
//            return;
//        dfs(root.left);
//        if(pre==null) {
//            head = root;
//        }
//        else{
//            pre.right=root;
//            root.left=pre;
//        }
//        pre=root;
//        dfs(root.right);
//    }
}
