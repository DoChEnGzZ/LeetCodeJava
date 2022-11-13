package easy;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null)
            return null;
        else if(head.val==val)
            return head.next;
        ListNode node=head;
        while(node.next!=null){
            if(node.next.val==val){
                    node.next=node.next.next;
            }
            node=node.next;
            if(node==null)
                break;
        }
        return head;
    }
}
