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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null && root.right==null) return 0;
        return lsum(root,false);
    }
    private int lsum(TreeNode root,boolean islft){
        if(root==null) return 0;
        if(root.left==null && root.right==null && islft) {
            return root.val;
        }
        return lsum(root.left,true)+lsum(root.right,false);
    }
}