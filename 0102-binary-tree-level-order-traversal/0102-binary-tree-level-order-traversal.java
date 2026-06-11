class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {

            int cnt = q.size();
            List<Integer> sub = new ArrayList<>();

            for(int i = 0; i < cnt; i++) {

                TreeNode curr = q.poll();

                sub.add(curr.val);

                if(curr.left != null)
                    q.offer(curr.left);

                if(curr.right != null)
                    q.offer(curr.right);
            }

            ans.add(sub);
        }

        return ans;
    }
}