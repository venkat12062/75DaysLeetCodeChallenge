import java.util.*;

class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < op.length; i++) {
            
            if (op[i].equals("+")) {
                int a = st.pop();
                int b = st.peek();
                int sum = a + b;
                st.push(a);
                st.push(sum);
                
            } else if (op[i].equals("D")) {
                st.push(2 * st.peek());
                
            } else if (op[i].equals("C")) {
                st.pop();
                
            } else {
                st.push(Integer.parseInt(op[i]));
            }
        }

        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
    }
}