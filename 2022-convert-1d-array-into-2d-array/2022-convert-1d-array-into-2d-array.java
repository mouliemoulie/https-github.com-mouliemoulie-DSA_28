class Solution {
    public int[][] construct2DArray(int[] org, int m, int n) {
       int k=0;
       //int i=0;
       //int j=0;
       int[][] mat=new int[m][n];
       if(n*m!=org.length) return new int[0][0];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
               if(k<org.length){
                   mat[i][j]=org[k];
                   //System.out.print(mat[i][j]);
                 }
               k++;
           }
       }
       return mat;
    }
}