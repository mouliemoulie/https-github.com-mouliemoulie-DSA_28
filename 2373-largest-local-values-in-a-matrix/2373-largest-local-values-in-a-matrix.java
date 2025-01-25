class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] maxlocal=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                maxlocal[i][j]=findmax(grid,i,j);
            }
        }
        return maxlocal;
    }
    int findmax(int[][] arr,int ist,int jst){
        int max=Integer.MIN_VALUE;
        for(int x=ist;x<ist+3;x++){
            for(int y=jst;y<jst+3;y++){
                max=Math.max(max,arr[x][y]);
            }
        }
        return max;
    }
}