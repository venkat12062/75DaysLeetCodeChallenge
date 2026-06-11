class Solution {
    public boolean isBalanced(TreeNode root) {

        if(root == null)
            return true;

        int lh = maxdepth(root.left);
        int rh = maxdepth(root.right);

        if(Math.abs(lh - rh) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxdepth(TreeNode root) {
        if(root == null)
            return 0;

        int lh = maxdepth(root.left);
        int rh = maxdepth(root.right);

        return 1 + Math.max(lh, rh);
    }
}