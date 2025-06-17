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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        caldiameter(root);
        return diameter;
        
    }
    private int caldiameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int lfth=caldiameter(root.left);
        int rith=caldiameter(root.right);
        int dia=lfth+rith;
        diameter=Math.max(dia,diameter);
        return 1+Math.max(lfth,rith);
    }
}