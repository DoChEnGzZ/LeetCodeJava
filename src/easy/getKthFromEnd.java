package easy;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode first = head, second = head;
        int j = k;
        while (j > 1) {
            first = first.next;
            j--;
        }
        while (first.next != null && first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)
        {
            return head;
        }
        else{
            ListNode node=reverse(head.next);
            ListNode next=head.next;
            next.next=head;
            head.next=null;
            return node;
        }
    }
}
