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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root ==null) return res;
        int cnt=0;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> levels=new ArrayList<>();
            cnt+=1;
           int ls=q.size();
            for(int i=0;i<ls;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                levels.add(q.poll().val);
            }
            if(cnt%2==0){
                Collections.reverse(levels);
                res.add(levels);
            }
            else res.add(levels);
        }
        return res;
    }
}