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
    int cnt=0;
    public int kthSmallest(TreeNode root, int k) {
        return findkth(root,k);
    }
    private int findkth(TreeNode r,int t){
        if(r==null){
            return 0;
        }
        int left=findkth(r.left,t);
        if(left!=0){
            return left;
        }
        cnt+=1;
        if(cnt==t){
            return r.val;
        }   
        return findkth(r.right,t);
    }
}