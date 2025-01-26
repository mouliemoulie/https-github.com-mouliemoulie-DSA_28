class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
       // int  x=0, y=0;
        int r=mat.length;
        int c=mat[0].length;
        //if(mat[0][0]==t) return true;
        for(int i=0;i<r;i++){
            if(mat[i][0]<=t && mat[i][c-1]>=t){
                for(int j=0;j<c;j++){
                    if(mat[i][j]==t){
                        return true;
                    }
                }
               // x++;
            }
        }
        return false;
    }
}