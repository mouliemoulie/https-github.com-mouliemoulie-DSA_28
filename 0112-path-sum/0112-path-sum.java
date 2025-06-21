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
    public boolean hasPathSum(TreeNode root, int tsum) { 
        if(root==null) return false;
        if(root.val==tsum && root.left==null && root.right==null) return true;
        return hasPathSum(root.left,tsum-root.val) || hasPathSum(root.right,tsum-root.val);
    }
}