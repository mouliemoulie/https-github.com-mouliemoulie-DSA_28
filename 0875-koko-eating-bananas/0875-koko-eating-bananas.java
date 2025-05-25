class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int p : piles) {
            r = Math.max(r, p);
        }

        int ans = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hours = eathrs(piles, mid);  // note: long

            if (hours <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private long eathrs(int[] piles, int x) {
        long tot = 0;
        for (int i : piles) {
            tot += (i + x - 1L) / x;  // force long to avoid overflow
        }
        return tot;
    }
}
