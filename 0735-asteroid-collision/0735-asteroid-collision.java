class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack();
        int n= asteroids.length;
        for(int i=0;i<n;i++){
            int num=asteroids[i];
            if(num>0){
                st.push(num);
            }else{
               while(!st.isEmpty()&&st.peek()>0&&Math.abs(num)>st.peek()){
                st.pop();
               }
                if(!st.isEmpty()&&Math.abs(num)==st.peek()){
                    st.pop();

                }
                else if(st.isEmpty()||st.peek()<0){
                    st.push(num);
                }
               }
            
        }
        int arr[]=new int[st.size()];
      for(int i=arr.length-1;i>=0;i--){
    arr[i]=st.pop();
}
        return arr;
    }
}