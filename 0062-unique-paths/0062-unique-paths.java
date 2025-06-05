class Solution {
    public int uniquePaths(int m, int n) { 
        int[][] dp = new int[m + 1][n + 1];  // to store results of subproblems
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1); // initialize with -1 (not yet computed)
        }
        return help(m, n, dp);  
    }

    private int help(int r, int c, int[][] dp) {
        if (r == 1 || c == 1) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        dp[r][c] = help(r - 1, c, dp) + help(r, c - 1, dp);
        return dp[r][c];
    }
}
