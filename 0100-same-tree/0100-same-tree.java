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

    public void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,"); // null marker
            return;
        }

        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        preorder(p, s1);
        preorder(q, s2);

        return s1.toString().equals(s2.toString());
    }
}