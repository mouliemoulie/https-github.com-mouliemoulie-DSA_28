class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int round = 0; round < cols; round++) {
            int roundMax = 0;

            for (int i = 0; i < rows; i++) {
                int maxVal = 0;
                int maxIndex = -1;

                // Find the maximum value and its index in the current row
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] > maxVal) {
                        maxVal = grid[i][j];
                        maxIndex = j;
                    }
                }

                // Remove that maximum by setting it to 0
                if (maxIndex != -1) {
                    grid[i][maxIndex] = 0;
                }

                // Update the round maximum
                roundMax = Math.max(roundMax, maxVal);
            }

            sum += roundMax;
        }

        return sum;
    }
}
