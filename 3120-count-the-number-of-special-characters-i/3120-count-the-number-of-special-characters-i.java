class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> low = new HashSet<>();
        HashSet<Character> high = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                low.add(ch);
            } else {
                high.add(ch);
            }
        }
        int count = 0;
        for (char ch : low) {
            char upper = (char)(ch - 32);
            if (high.contains(upper)) {
                count++;
            }
        }
        return count;
    }
}