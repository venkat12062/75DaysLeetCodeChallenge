class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                equal.add(num);
            }
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        for (int num : less) {
            ans[idx++] = num;
        }

        for (int num : equal) {
            ans[idx++] = num;
        }

        for (int num : greater) {
            ans[idx++] = num;
        }

        return ans;
    }
}