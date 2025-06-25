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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key) return helper(root);
        TreeNode curr = root;
        while (curr!=null) {
            if (curr.val>key) {
                if (curr.left!=null && curr.left.val == key) {
                    TreeNode leftside=helper(curr.left);
                    curr.left=leftside;
                    break;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.right!=null && curr.right.val == key) {
                    TreeNode rightside=helper(curr.right);
                    curr.right=rightside;
                    break;
                } else {
                    curr = curr.right;
                }
            }
        }
        return root;
    }
    private TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else{
            TreeNode rootrht=root.right;
            TreeNode lastright=findlstright(root.left);
            lastright.right=rootrht;
            return root.left;
        }
    }
    private TreeNode findlstright(TreeNode root){
        if(root.right==null){
            return root;
        }
        return findlstright(root.right);
    } 
}