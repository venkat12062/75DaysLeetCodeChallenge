class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sett = new HashSet<Integer>();
        
        for (int i : nums) {
            if (sett.contains(i)) {
                return true;
            } else {
                sett.add(i);
            }
        }

        return false;
    }
}