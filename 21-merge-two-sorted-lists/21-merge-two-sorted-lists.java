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
     /*   ListNode head = new ListNode();
        ListNode tail = head;
        while(list1 !=null && list2 !=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next = (list1!=null) ? list1 : list2;
        return head.next;  */
        
        
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        if(list1.val>list2.val){
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        
        ListNode res=list1;
        while(list1!=null && list2!=null){
            ListNode t=null;
            while(list1!=null && list1.val<=list2.val){
                t=list1;
                list1=list1.next;
            }
            t.next=list2;
            
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        return res;
        
    }
}