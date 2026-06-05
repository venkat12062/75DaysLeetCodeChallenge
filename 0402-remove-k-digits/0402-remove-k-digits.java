class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 &&
                   st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans = ans.substring(1);
        }

        return ans.length() == 0 ? "0" : ans;
    }
}