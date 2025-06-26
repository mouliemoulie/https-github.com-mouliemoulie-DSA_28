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
class BSTIterator {
    private Stack<TreeNode> st = new Stack<>();
    private boolean rev = true;

    public BSTIterator(TreeNode root, boolean reverse) {
        rev = reverse;
        pushAll(root);
    }

    public int next() {
        TreeNode temp = st.pop();
        if (rev == false)
            pushAll(temp.right); //nxt
        else
            pushAll(temp.left); //bfr
        return temp.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            st.push(node);
            if (rev == false)
                node = node.left;
            else
                node = node.right;
        }
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BSTIterator nxt = new BSTIterator(root, false); //store ele in asc order(inorder)
        BSTIterator bfr = new BSTIterator(root, true); //store ele in desc order(inorder)
        int sum = 0;
        int i=nxt.next(); //gives smallest ele
        int j=bfr.next(); //gives highest ele
        while (i<j) {
            sum = i + j;
            if (sum == k)
                return true;
            else if (sum > k)
                j=bfr.next();
            else if (sum < k)
                i=nxt.next();
        }
        return false;
    }

}