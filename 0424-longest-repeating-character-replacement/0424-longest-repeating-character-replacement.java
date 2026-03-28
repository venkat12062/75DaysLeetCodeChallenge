class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        for (char target = 'A'; target <= 'Z'; target++) {
            int left = 0, changes = 0;

            for (int right = 0; right < n; right++) {
                if (s.charAt(right) != target) {
                    changes++;
                }
                while (changes > k) {
                    if (s.charAt(left) != target) {
                        changes--;
                    }
                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}