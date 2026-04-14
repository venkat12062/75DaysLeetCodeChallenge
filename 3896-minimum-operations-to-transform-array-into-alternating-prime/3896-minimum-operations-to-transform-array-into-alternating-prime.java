class Solution {
    public int minOperations(int[] nums) {
        int ops = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (i % 2 == 0) { // even index → need prime
                while (!isPrime(val)) {
                    val++;
                    ops++;
                }
            } else { // odd index → need non-prime
                while (isPrime(val)) {
                    val++;
                    ops++;
                }
            }
        }

        return ops;
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}