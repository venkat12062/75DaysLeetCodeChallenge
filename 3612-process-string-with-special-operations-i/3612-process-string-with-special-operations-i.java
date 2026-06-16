class Solution {
    public String processStr(String s) {
      int l=s.length();
StringBuilder sb=new StringBuilder();
for(int i=0;i<l;i++){
    char ch=s.charAt(i);
    if(ch>='a'&&ch<='z'){
        sb.append(ch);
    }else if(ch=='*'&&sb.length()>0){
        sb.deleteCharAt(sb.length() - 1);

    }else if(ch=='#'){
        String cur=sb.toString();
        sb.append(cur);
    }else if(ch=='%'){
        
        sb.reverse();
    }
}
return sb.toString();
    }
}