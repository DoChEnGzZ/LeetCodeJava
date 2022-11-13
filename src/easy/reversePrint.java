package easy;

import javax.lang.model.type.NullType;

/**
https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class reversePrint {
    public int[] reversePrint(ListNode head) {
        /**
         * 最简单的方法*/
//        int len=0;
//        ListNode node=head;
//        while (node!= null)
//        {
//            len++;
//            node=node.next;
//        }
//        node=head;
//        int[] result=new int[len];
//        while(node!=null){
//            len--;
//            result[len]=node.val;
//            node=node.next;
//        }
//        return result;
        /**
         * 倒置链表
         */
        ListNode p=head;
        ListNode q=null;
        ListNode r=null;
        while(p!=null)
        {
            r=p.next;
            p.next=q;
            q=p;
            p=r;
        }
        int len=0;
        ListNode node=head;
        while (node!= null)
        {
            len++;
            node=node.next;
        }
        node=head;
        int[] result=new int[len];
        while(node!=null){
            int i=0;
            result[i++]=node.val;
            node=node.next;
        }
        return result;
    }

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
