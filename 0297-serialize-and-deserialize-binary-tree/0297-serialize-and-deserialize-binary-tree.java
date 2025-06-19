/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helperSerialize(root, sb);
        return sb.toString();
    }

    private void helperSerialize(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#,");
            return;
        }
        sb.append(node.val).append(",");
        helperSerialize(node.left, sb);
        helperSerialize(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        List<String> nodes = new ArrayList<>(Arrays.asList(data.split(",")));
        return helperDeserialize(nodes);
    }

    private TreeNode helperDeserialize(List<String> nodes) {
        if (nodes.isEmpty()) return null;

        String val = nodes.remove(0);
        if (val.equals("#")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helperDeserialize(nodes);
        node.right = helperDeserialize(nodes);
        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));