/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return Collections.emptyList();
        
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        boolean reverse=false;
        q.add(root);
        List<List<Integer>> result=new ArrayList<>();
        
        while(!q.isEmpty()){
            int size=q.size();
             List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(reverse==true) st.push(curr.val);
                else
                    l.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(reverse){
                while(!st.isEmpty()){
                    l.add(st.pop());
                }
            }
            reverse=!reverse;
            result.add(l);
        }
        return result;
    }
}