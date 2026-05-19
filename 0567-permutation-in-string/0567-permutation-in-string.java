class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char []c1=s1.toCharArray();
        Arrays.sort(c1);
        String S1=new String(c1);
         int k = s1.length();

        for (int i = 0; i <= s2.length() - k; i++) {

            String sub = s2.substring(i, i + k);

            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);

            String curr = new String(arr2);

            if (curr.equals(S1)) {
                return true;
            }
        }
return false;
    }
}