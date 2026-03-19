class Solution {
    public boolean isPalindrome(String s) {
        
        int n=s.length();
        int i=0;int j=n-1;
        
        while(i<=j){
            char t=s.charAt(i);
            char lt=s.charAt(j);
            if(!Character.isLetterOrDigit(t)){
                i++;
            } else if(!Character.isLetterOrDigit(lt)){
                j--;
              }  else{
                    if(Character.toLowerCase(t)!=Character.toLowerCase(lt)){
                        return false;
                    }
                    i++;
                    j--;
                    }}
            return true;
        
    }
}