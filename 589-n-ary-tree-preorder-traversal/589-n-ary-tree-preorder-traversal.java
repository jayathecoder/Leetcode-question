/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    static final int EMPTY=-1;
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        serialize(root,arr);
        return arr;
    }
    void serialize(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        for(Node c:root.children)
           serialize(c,arr);
    }
}