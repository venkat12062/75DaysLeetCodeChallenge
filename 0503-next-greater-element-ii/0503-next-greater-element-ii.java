import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ng[] = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 2*n - 1; i >= 0; i--) {
            int num=nums[i%n];
            
            while(!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()) {
                    ng[i] = -1;
                } else {
                    ng[i] = st.peek();
                }}
            

            st.push(num);
        }
        
        return ng;
    }
}