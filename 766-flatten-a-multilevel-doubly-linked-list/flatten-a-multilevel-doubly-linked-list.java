/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node node = head;
        Stack<Node> stk = new Stack<>();
        while(node != null ){
            if(node.child != null){
               if(node.next != null) stk.push(node.next);
               node.next = node.child;
               node.next.prev = node;
               node.child = null;
            }else if(node.next == null && !stk.isEmpty()){
               node.next = stk.pop();
               node.next.prev = node;
            }
            node = node.next;
        }
        return head;
    }
}