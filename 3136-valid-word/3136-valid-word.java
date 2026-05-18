class Solution {
    public boolean isValid(String word) {

        if(word.length() < 3) {
            return false;
        }

        boolean vow = false;
        boolean con = false;

        String v = "aeiouAEIOU";

        for(int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if(!((ch >= 'A' && ch <= 'Z') ||
                 (ch >= 'a' && ch <= 'z') ||
                 (ch >= '0' && ch <= '9'))) {

                return false;
            }

            if((ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z')) {

                if(v.indexOf(ch) != -1) {
                    vow = true;
                }
                else {
                    con = true;
                }
            }
        }

        if(con==true&&vow==true){
            return true;
        }
        return false;
    }
}