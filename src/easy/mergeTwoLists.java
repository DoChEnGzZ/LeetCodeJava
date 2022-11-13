package easy;

/*
* https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/*/
public class mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1=l1,node2=l2,cur=new ListNode(0);
        ListNode result=cur;
        while(node1!=null&&node2!=null){
            if(node1.val<= node2.val){
                cur.next=node1;
                cur=cur.next;
                node1=node1.next;
            }
            else{
                cur.next=node2;
                cur=cur.next;
                node2=node2.next;
            }
        }
        cur.next=node1==null?node2:node1;
        return result.next;
    }
}
