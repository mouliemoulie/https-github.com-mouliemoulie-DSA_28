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
    public boolean isBalanced(TreeNode root) {
        return deptree(root)!=-1;
    }
    private int deptree(TreeNode r){
        if(r==null){
            return 0;
        }
        int ls=deptree(r.left);
        if(ls==-1) return -1;
        int rs=deptree(r.right);
        if(rs==-1) return -1;
        if(Math.abs(ls-rs)>1) return -1;   
        return 1+Math.max(ls,rs);
    }
}