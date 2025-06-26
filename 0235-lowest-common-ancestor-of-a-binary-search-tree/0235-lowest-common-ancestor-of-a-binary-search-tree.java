/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        int currval=root.val;
        if(currval>p.val && currval>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(currval<p.val && currval<q.val){
           return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}