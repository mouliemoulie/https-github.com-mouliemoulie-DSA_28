class Solution {
    public int numSubarraysWithSum(int[] nums, int g) {
        int c1 = help(nums, g);
        int c2 = help(nums, g - 1);
        return c1 - c2;
    }

    private int help(int[] nums, int g) {
        if (g < 0) return 0;
        int l = 0, r = 0, cnt = 0, sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (l <= r && sum > g) {
                sum -= nums[l];
                l++;
            }
            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }
}
