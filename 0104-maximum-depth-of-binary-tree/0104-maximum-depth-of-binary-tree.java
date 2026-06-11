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
        int lh=0;
        int rh=0;
        if(root==null){
            return 0;
        }
        else{
             lh=maxDepth(root.left);
             rh=maxDepth(root.right);
        }
         return Math.max(lh,rh)+ 1;
    }
}