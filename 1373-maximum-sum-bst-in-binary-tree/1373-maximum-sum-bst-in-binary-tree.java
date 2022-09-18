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
         int maxSum=0;
   public int maxSumBST(TreeNode root) {
       helper(root);
       return maxSum;
   }
   public int[] helper(TreeNode root){
       if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0}; // {min, max, sum}, 
       int[] left = helper(root.left);
       int[] right = helper(root.right);
     
      if(left[1]<root.val && root.val<right[0]){ //check if it's Valid  BST
       int sum = root.val + left[2] + right[2]; 
        maxSum = Math.max(maxSum, sum);
       int min = Math.min(root.val, left[0]);
       int max = Math.max(root.val, right[1]);
       return new int[]{min, max, sum};
      }
       return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0};
    }
}