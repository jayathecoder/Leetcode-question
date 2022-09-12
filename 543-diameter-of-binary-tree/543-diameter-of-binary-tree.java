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
    int res=0;
    public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh);
        return (Math.max(lh,rh)+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int d1=height(root.right)+height(root.left);
        int d2=diameterOfBinaryTree(root.left);
        int d3=diameterOfBinaryTree(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }
}