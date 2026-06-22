import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            } else {
                s2.push(ch);
            }
        }

        while (!s1.isEmpty()) {
            sb1.insert(0, s1.pop());
        }

        while (!s2.isEmpty()) {
            sb2.insert(0, s2.pop());
        }

        return sb1.toString().equals(sb2.toString());
    }
}