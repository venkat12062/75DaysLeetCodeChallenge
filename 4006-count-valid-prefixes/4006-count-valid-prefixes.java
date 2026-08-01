class Solution {
    public int countValidPrefixes(String s) {
        int zero = 0;
        int one = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }

            if (Math.abs(zero - one) <= 1) {
                cnt++;
            }
        }

        return cnt;
    }
}