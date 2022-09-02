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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Double> res=new ArrayList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
           int n = q.size();
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();  
                sum += node.val; 
                if (node.left != null)    q.offer(node.left);
                if (node.right != null)   q.offer(node.right);
            }
            res.add(sum / n); // average value in the level
        }
        return res;
    }
}