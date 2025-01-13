class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] trans=new int[c][r];
        int i=0;
        int j=0;
        while(i<r){
            j=0;
            while(j<c){
                int ele=matrix[i][j];
                trans[j][i]=ele;
                j++;
            }
            i++;
        }

        return trans;
    }
}