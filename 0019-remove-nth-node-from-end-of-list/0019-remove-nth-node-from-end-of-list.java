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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode temp=head,curr=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
		//*if only one node is present*
        if((len-n+1)==1)
        {
            return head.next;
        }
		//after this loop curr will be on previous
		//of Node which needs to be deleted
        for(int i=1;i<len-n;i++)
        {
            curr=curr.next;
        }
        ListNode prev=curr.next.next;
        curr.next=prev;
        return head;
    }
}