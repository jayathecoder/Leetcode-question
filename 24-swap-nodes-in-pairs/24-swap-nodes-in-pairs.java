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
    public ListNode swapPairs(ListNode head) {
          //Base condition
        if(head == null || head.next == null)   
        return head;
        
        //Create a tmp node whose next pointer will point to the current head
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        
        //Now take a curr node which will be used to traverse the list
        ListNode curr = tmp;
        
        // Loop until we reach to the second last node...
        while(curr.next != null && curr.next.next != null){
            
            //In each iteration, take two nodes, n1 = curr.next and n2 = curr.next.next.
            ListNode n1 = curr.next;
            ListNode n2 = curr.next.next;
            
            n1.next = n2.next;              // Point the next of n1 to the node after n2
            curr.next = n2;                 // Now n2 node should be the curr.next node.
            curr.next.next = n1;            // Linking n2 to the n1 node.
            curr = curr.next.next;    // Move the pointer two nodes ahead
    }
 
    return tmp.next;    //at last return the tmp.next
    }
}