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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    private int helper(TreeNode r){
        if(r==null){
            return 0;
        }
        int l=helper(r.left);
        int rht=helper(r.right);
        l=Math.max(0,l);
        rht=Math.max(0,rht);
        ans=Math.max(ans,l+rht+r.val);
        return Math.max(l,rht)+r.val;
    }
}