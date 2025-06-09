class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long lcm = nums[i];
            int gcd = nums[i];

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);

                if (prod == gcd * lcm) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                if (prod > 1e18 || lcm > 1e9) break; // avoid overflow
            }
        }

        return maxLen;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a / gcd((int)a, (int)b) * b;
    }
}
