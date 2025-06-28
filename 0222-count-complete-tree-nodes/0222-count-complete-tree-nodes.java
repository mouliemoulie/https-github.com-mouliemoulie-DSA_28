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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lt = helper1(root.left);//find left tree height
        int rt = helper2(root.right); // find right tree height
        if (lt == rt)
            return ((2 << lt) - 1);
        else
            return countNodes(root.left) + countNodes(root.right) + 1;
    }

    private int helper1(TreeNode r) {
        int cnt = 0;
        while (r != null) {
            cnt++;
            r = r.left;
        }
        return cnt;
    }

    private int helper2(TreeNode r) {
        if (r == null) {
            return 0;
        }
        int rt = 0; // declare first
        rt += 1 + helper2(r.right); // accumulate
        return rt;
    }

}