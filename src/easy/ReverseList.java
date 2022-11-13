package easy;

/**
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        /**
         * 直接遍历法
         */
//        ListNode node=head;
//        ListNode prev=null;
//        ListNode next=null;
//        while(node!=null)
//        {
//            next=node.next;
//            node.next=prev;
//            prev=node;
//            node=next;
//        }
//        return prev;
        /**
         * 递归法
         */
        if(head==null||head.next==null)
        {
            return head;
        }
        else {
            ListNode node=reverseList(head.next);//实际上这个node返回的就是最后一个结点，实际上是逆转之后的头节点
            ListNode next=head.next;
            next.next=head;
            head.next=null;
            return node;
        }
    }

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
