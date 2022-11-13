package Mid;

/*https://leetcode.cn/problems/add-two-numbers/?favorite=2cktkvj*/

import easy.ListNode;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        int carry=0;
        ListNode temp=res;
        while(l1!=null||l2!=null){
            int x= l1==null?0:l1.val;
            int y= l2==null?0:l2.val;
            ListNode node=new ListNode((x+y+carry)%10);
            carry=(x+y+carry)/10;
            temp.next=node;
            temp=node;
            l1= l1==null? null :l1.next;
            l2=l2==null?null:l2.next;
        }
        if(carry!=0){
            temp.next= new ListNode(carry);
        }
        return res.next;
    }
}
