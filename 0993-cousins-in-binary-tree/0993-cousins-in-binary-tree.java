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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean xFound = false, yFound = false;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null && node.right != null) {
                    // Check if x and y are siblings
                    if ((node.left.val == x && node.right.val == y) ||
                        (node.left.val == y && node.right.val == x)) {
                        return false; // Same parent
                    }
                }

                if (node.left != null) {
                    q.add(node.left);
                    if (node.left.val == x) xFound = true;
                    if (node.left.val == y) yFound = true;
                }

                if (node.right != null) {
                    q.add(node.right);
                    if (node.right.val == x) xFound = true;
                    if (node.right.val == y) yFound = true;
                }
            }

            // If both found at same level and not siblings
            if (xFound && yFound) return true;

            // If only one found at this level
            if (xFound || yFound) return false;
        }

        return false;
    }
}