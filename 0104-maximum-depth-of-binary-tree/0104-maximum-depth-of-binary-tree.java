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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        //List<List<Integer>> res=new ArrayList<>();
        int cnt=0;
        if(root==null) return cnt;
        q.add(root);
        while(!q.isEmpty()){
            //List<Integer> sub=new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                q.poll();
            }
            cnt+=1;
        }
        return cnt;
        
    }
}