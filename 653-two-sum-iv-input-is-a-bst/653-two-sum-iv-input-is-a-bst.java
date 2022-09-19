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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        return isPairSum(root,k,hs);
    }
    public boolean isPairSum(TreeNode root,int sum,HashSet<Integer> hs){
        if(root==null) return false;
        if(isPairSum(root.left,sum,hs)==true) return true;
        if(hs.contains(sum-root.val)) return true;
        else
            hs.add(root.val);
        return isPairSum(root.right,sum,hs);
    }
}