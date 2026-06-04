class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int num = num1; num <= num2; num++) {

            int temp = num;

            ArrayList<Integer> digits = new ArrayList<>();

            while (temp > 0) {
                digits.add(temp % 10);
                temp /= 10;
            }

            Collections.reverse(digits);

            for (int i = 1; i < digits.size() - 1; i++) {
                int left = digits.get(i - 1);
                int curr = digits.get(i);
                int right = digits.get(i + 1);

                if ((curr > left && curr > right) ||
                    (curr < left && curr < right)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}