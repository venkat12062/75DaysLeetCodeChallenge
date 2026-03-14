class Solution {
    public boolean isAnagram(String s, String r) {
        char arr[]=s.toCharArray();
        char ar2[]=r.toCharArray();
        if(s.length()!=r.length())return false;
        Arrays.sort(arr);
         Arrays.sort(ar2);
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=ar2[i]){
                return false;
            }
                
         }    
         return true;
    
}}