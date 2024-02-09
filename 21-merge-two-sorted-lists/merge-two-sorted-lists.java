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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merge = new ListNode();
        if(list1 != null && list2 != null){
            
            if(list1.val <= list2.val){
                merge = list1;
               list1.next =  mergeTwoLists(list1.next, list2);
            }else{
                  merge = list2;
               list2.next =  mergeTwoLists(list1, list2.next);
            }
             return merge;
        } 
        if(list1 == null){
            return list2;
        }else{
            return list1;
        }
       
    }
}