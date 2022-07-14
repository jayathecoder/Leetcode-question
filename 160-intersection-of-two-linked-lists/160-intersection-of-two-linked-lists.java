/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null ) return null;
        
        ListNode dummy1=headA,dummy2=headB;
         while(dummy1!=dummy2){
             dummy1= dummy1==null ? headB : dummy1.next;
             dummy2= dummy2==null ? headA : dummy2.next;
         }
        return dummy1;
    }
}