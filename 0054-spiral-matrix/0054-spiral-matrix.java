

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int rb = 0; // row begin
        int re = matrix.length - 1; // row end
        int cb = 0; // column begin
        int ce = matrix[0].length - 1; // column end
        
        while (rb <= re && cb <= ce) {
            // Traverse from left to right along the top row
            for (int i = cb; i <= ce; i++) {
                res.add(matrix[rb][i]);
            }
            rb++; // Move top boundary down
            
            // Traverse from top to bottom along the right column
            for (int i = rb; i <= re; i++) {
                res.add(matrix[i][ce]);
            }
            ce--; // Move right boundary left
            
            // Traverse from right to left along the bottom row, if still valid
            if (rb <= re) {
                for (int i = ce; i >= cb; i--) {
                    res.add(matrix[re][i]);
                }
                re--; // Move bottom boundary up
            }
            
            // Traverse from bottom to top along the left column, if still valid
            if (cb <= ce) {
                for (int i = re; i >= rb; i--) {
                    res.add(matrix[i][cb]);
                }
                cb++; // Move left boundary right
            }
        }
        
        return res;
    }
}
