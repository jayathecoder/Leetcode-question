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
 public class Pair {
        TreeNode node = null;
        int index = 0;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Pair> que = new LinkedList<>();
        que.addLast(new Pair(root, 0));

        int max = 0;
        while (que.size() != 0) {
            int size = que.size();
            int leftMostIndex = que.getFirst().index;
            int rightMostIndex = que.getFirst().index;
            while (size-- > 0) {

                Pair rn = que.removeFirst();
                TreeNode node = rn.node;
                int pi = rn.index;
                if (node.left != null) {
                    que.addLast(new Pair(node.left, pi * 2 + 1));
                }
                if (node.right != null) {
                    que.addLast(new Pair(node.right, pi * 2 + 2));
                }
                rightMostIndex = pi;
            }
            max = Math.max(max, rightMostIndex - leftMostIndex + 1);
        }
        return max;
    }
}