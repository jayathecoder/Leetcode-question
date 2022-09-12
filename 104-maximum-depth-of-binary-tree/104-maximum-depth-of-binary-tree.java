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
        return (Math.max(height(root.left),height(root.right)))+1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        TreeNode head1=root,head2=root;
        int maxLeft=height(root.left)+1,maxRight=height(root.right)+1;
       
        return( Math.max(maxLeft,maxRight));
    }
}