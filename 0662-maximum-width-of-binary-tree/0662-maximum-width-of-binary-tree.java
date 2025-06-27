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
 class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode n,int i){
        node=n;
        num=i;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int ans=-1;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minindx=q.peek().num;
            int f=0,l=0;
            for(int i=0;i<size;i++){
                int currid=q.peek().num-minindx;
                TreeNode n=q.peek().node;
                q.poll();
                if(i==0) f=currid;
                if(i==size-1) l=currid;
                if(n.left!=null){
                    q.add(new Pair(n.left,currid*2+1));
                }
                if(n.right!=null){
                    q.add(new Pair(n.right,currid*2+2));
                }

            }
            ans=Math.max(ans,l-f+1);
        }
        return ans;
    }
}