package easy;

/*https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/*/
public class getIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int dis=getListNodeLength(headA)-getListNodeLength(headB);
        ListNode nodeA=headA,nodeB=headB;
        if(dis>0){
            while (dis>0){
                nodeA=nodeA.next;
                dis--;
            }
        }
        else if(dis<0){
            while(dis<0)
            {
                nodeB=nodeB.next;
                dis++;
            }
        }
        while(nodeA!=null&&nodeB!=null)
        {
            if(nodeA==nodeB){
                return nodeA;
            }
            else{
                nodeA=nodeA.next;
                nodeB=nodeB.next;
            }
        }
        return null;
    }
    public static int getListNodeLength(ListNode head){
        int length=0;
        ListNode node=head;
        while(node!=null)
        {
            length++;
            node=node.next;
        }
        return length;
    }
}
