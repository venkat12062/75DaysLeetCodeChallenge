import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty()) {
                char top = st.peek();

                if ((top == 'A' && ch == 'B') || (top == 'C' && ch == 'D')) {
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }

        return st.size();
    }
}