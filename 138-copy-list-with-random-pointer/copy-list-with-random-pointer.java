/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
/*
1. insert the copy node
2. conect the random pointer
3. connect next pointer
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        // step 1  insert the copy node
        while(temp != null){
            Node node = new Node(temp.val);
            Node forward = temp.next;
            temp.next = node;
            node.next = forward;
            temp = forward;
        }
        // step 2  conect the random pointer
        temp = head;
        while(temp != null){
            Node randomNode = temp.random;
            if(randomNode != null) temp.next.random = randomNode.next;
            else temp.next.random = null;
            temp = temp.next.next;
        }
        // step 3 connect next pointer
        temp = head;
        Node prehead = new Node(-1);
        Node dummy = prehead;
        while(temp != null){
            dummy.next = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
            dummy = dummy.next;
        }
        return prehead.next;
    }
}