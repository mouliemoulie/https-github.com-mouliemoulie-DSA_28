class Solution {
    public int[][] construct2DArray(int[] org, int m, int n) {
       int k=0;
       int i=0;
       int j=0;
       int[][] mat=new int[m][n];
       if(n*m!=org.length) return new int[0][0];
       while(i<m){
           j=0;
           while(j<n){
               if(k<org.length){
                   mat[i][j]=org[k];
                   //System.out.print(mat[i][j]);
               }
               k++;
               j++;
           }
           i++;
       }
       return mat;
    }
}