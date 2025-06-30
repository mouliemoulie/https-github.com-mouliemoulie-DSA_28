class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    /*if(matrix[0].length==1){
        if(matrix[0][0]==target) return true;
        else return false;
    }*/
     int r=0;
     int n=matrix.length;
     int c=matrix[0].length-1;  
     while(r<n && c>=0){
        if(matrix[r][c]==target){
            return true;
        }
        if(matrix[r][c]>target) c--;
        else r++;
     }   
     return false;
    }
}