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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode r1=q.poll();
            TreeNode r2=q.poll();
            if(r1==null && r2==null){
                continue;
            }
            if(r1==null || r2==null){
                return false;
            }
            if(r1.val!=r2.val){
                return false;
            }
            q.add(r1.left); //tree is symmetric if left.left==right.right and left.right==right==right.left
            q.add(r2.right);
            q.add(r1.right);
            q.add(r2.left);
        }
        return true;
    }
}