class Solution {
    public long sumAndMultiply(int n) {

        String s = ""+n;
        StringBuilder ans = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '0') {
                ans.append(ch);
                sum += ch - '0';
            }
        }

        if (ans.length() == 0) {
            return 0;
        }

        long num = Long.parseLong(ans.toString());

        return num * sum;
    }
}