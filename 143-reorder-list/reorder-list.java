/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode n = head;
        while(n != null){
            l.add(n.val);
            n = n.next;
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        int i = 0; 
        int j = l.size() -1;
        while(i <= j){
            l2.add(l.get(i));
            l2.add(l.get(j));
            i++;
            j--;
        }
     ListNode node = head;
     
     for(int k = 0; k<l2.size(); k++){
         if(node != null){
             node.val = l2.get(k);
             node = node.next;
         }
     }
    }
}