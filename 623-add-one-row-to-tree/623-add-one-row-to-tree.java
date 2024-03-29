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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode ans=new TreeNode(val);
            ans.left=root;
            return ans;
        }
        
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(depth-->2){
            Queue<TreeNode> temp=new LinkedList<>();
            while(!que.isEmpty()){
                TreeNode top=que.poll();
                if(top.left!=null) temp.add(top.left);
                if(top.right!=null) temp.add(top.right);
            }
            que=temp;
        }
        
        while(!que.isEmpty()){
            TreeNode top=que.poll();
            TreeNode temp=top.left;
            top.left=new TreeNode(val);
            top.left.left=temp;
            temp=top.right;
            top.right=new TreeNode(val);
            top.right.right=temp;
        }
        return root;
    }
}