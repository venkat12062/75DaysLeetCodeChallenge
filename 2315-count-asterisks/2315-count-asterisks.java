class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        boolean inside = false;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                inside = !inside;
            } else if (ch == '*' && !inside) {
                cnt++;
            }
        }

        return cnt;
    }
}