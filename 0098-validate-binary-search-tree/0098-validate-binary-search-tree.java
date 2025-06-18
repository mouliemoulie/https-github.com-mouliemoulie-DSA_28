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
    public boolean isValidBST(TreeNode root) {
        return chkbst(root,null,null);
    }
    private boolean chkbst(TreeNode root,Integer lowlimit,Integer highlimit){
        if(root==null){
            return true;
        }
        if(lowlimit!=null && root.val<=lowlimit){
            return false;
        }
        if(highlimit!=null && root.val>=highlimit){
            return false;
        }
        boolean lft=chkbst(root.left,lowlimit,root.val);
        boolean rht=chkbst(root.right,root.val,highlimit);
        return lft && rht;
    }
}