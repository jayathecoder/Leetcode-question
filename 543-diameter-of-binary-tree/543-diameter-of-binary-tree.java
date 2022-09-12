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
    public static int height(TreeNode root){
        if(root==null) return 0;
        return (Math.max(height(root.left),height(root.right))+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int d1=height(root.right)+height(root.left);
        int d2=diameterOfBinaryTree(root.left);
        int d3=diameterOfBinaryTree(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }
}