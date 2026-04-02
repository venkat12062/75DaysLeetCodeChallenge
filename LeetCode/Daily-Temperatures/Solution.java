1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        
4        int n = temperatures.length;
5        int[] answer = new int[n];
6        
7        Stack<Integer> stack = new Stack<>();
8        
9        for(int i=0;i<n;i++){
10            
11            while(!stack.isEmpty() && 
12                  temperatures[i] > temperatures[stack.peek()]){
13                
14                int index = stack.pop();
15                answer[index] = i - index;
16            }
17            
18            stack.push(i);
19        }
20        
21        return answer;
22    }
23}