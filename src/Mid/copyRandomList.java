package Mid;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */
public class copyRandomList {

    public static Node copyRandomList(Node head) {
        Map<Node, Node> NodeMap = new HashMap<Node, Node>();
        Node newhead;
        if (head == null) {
            return head;
        } else {
            Node node = head;
            newhead = new Node(head.val);
            Node node1 = newhead;
            NodeMap.put(head, newhead);
            if (node.random == null) {
                node1.random = null;
            } else {
                //random指向的结点尚未创建
                if (!NodeMap.containsKey(node.random)) {
                    Node temp = new Node(node.random.val);
                    node1.random = temp;
                    NodeMap.put(node.random, node1.random);
                }
                //random指向的结点以及创建
                else {
                    node1.random = NodeMap.get(node.random);
                }
            }
            node = node.next;
            while (node != null) {
                if (!NodeMap.containsKey(node)) {
                    Node nextNode = new Node(node.val);
                    node1.next = nextNode;
                    NodeMap.put(node, node1.next);
                } else {
                    node1.next = NodeMap.get(node);
                }
                node1=node1.next;
                //处理random
                if (node.random == null) {
                    node1.random = null;
                } else {
                    //random指向的结点尚未创建
                    if (!NodeMap.containsKey(node.random)) {
                        Node temp = new Node(node.random.val);
                        node1.random = temp;
                        NodeMap.put(node.random, node1.random);
                    }
                    //random指向的结点以及创建
                    else {
                        node1.random = NodeMap.get(node.random);
                    }
                }
                node = node.next;
            }
            return newhead;
        }
    }

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
