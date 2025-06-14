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
    public int sum=0;
    public int sumNumbers(TreeNode root) {
        calsum(root,0);
        return sum;
    }
    private void calsum(TreeNode root,int currsum){
        if(root.left==null && root.right==null){
            sum+=currsum*10+root.val;
            return;
        }
        if(root.left!=null) calsum(root.left,currsum*10+root.val);
        if(root.right!=null) calsum(root.right,currsum*10+root.val);
     }
}