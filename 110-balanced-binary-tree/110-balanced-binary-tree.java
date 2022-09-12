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
    private int dfsHeight(TreeNode root){
    if(root == null) return 0;
    
    int leftH = dfsHeight(root.left);
    if(leftH == -1) return -1;
    
    int rightH = dfsHeight(root.right);
    if(rightH == -1) return -1;
    
    if(Math.abs(leftH - rightH) > 1) return -1;
    
    return 1 + Math.max(leftH, rightH);
    }
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;  
    }
}