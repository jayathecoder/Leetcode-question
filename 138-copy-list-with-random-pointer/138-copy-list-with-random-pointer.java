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

class Solution {
    public Node copyRandomList(Node head) {
           if(head==null ){return head;}
        HashMap<Node,Node> map = new HashMap();//Making a HashMap Pair of Original as key and Copy list as value
        Node pointer= head;
        while(pointer!=null){   //Populating The HashMap Pair with Original as key and Copy list as value
            map.put(pointer,new Node(pointer.val));
            pointer=pointer.next; //itterate
        }
           pointer = head; // reset the pointer 
          while(pointer!=null){
           map.get(pointer).next = map.get(pointer.next);   // now get the pointer of copy.next and get the value of alternative origianl.next by passing it and we get the .next value as Copy list
            map.get(pointer).random = map.get(pointer.random);   // now get the pointer of copy.random and get the value of alternative origianl.random by passing it and we get the .next value as Copy list
             pointer = pointer.next; //itterate
        }
        return map.get(head); //return the alternate value of orignal head in copy list which is copy's head x_x
    }
}