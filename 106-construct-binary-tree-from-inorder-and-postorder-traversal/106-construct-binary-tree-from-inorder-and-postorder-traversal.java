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
     private int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = inorder.length - 1;
        return construct(inorder, postorder, 0, postorder.length - 1);
    }
    
    private TreeNode construct(int[] in, int[] post, int left, int right) {
        if (left > right || index < 0)
            return null;
        
        TreeNode root = new TreeNode(post[index--]);
        int mid = 0;
        for (int i = left; i <= right; i++) {
            if (in[i] == root.val) {
                mid = i;
                break;
            }
        }
        
        root.right = construct(in, post, mid + 1, right);
        root.left = construct(in, post, left, mid - 1);
        
        return root;
    }
}