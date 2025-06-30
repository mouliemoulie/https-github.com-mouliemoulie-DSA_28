class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int l = 0;
        int h = (mat.length * mat[0].length) - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            int row = mid / mat[0].length; //formula to change index value into row/col coordinate (ind/columnlength) -> row\
            int col = mid % mat[0].length;
            if (mat[row][col] == t)
                return true;
            if (mat[row][col] < t)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return false;
    }
}