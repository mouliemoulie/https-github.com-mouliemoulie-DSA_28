class Solution {
    public int countNegatives(int[][] grid) {
     int cnt=0;
     int r=grid.length;
     int i=0;
     int k=0;
     while(i<r){
        int j=0;
        k=(grid[i].length)-1;
        while(j<=k){
            int mid=(j+k)/2;
            if(grid[i][mid]<0){
                cnt+=(k-mid+1);
                k=mid-1;
            }
            else j=mid+1;
        }
        i+=1;
     } 
     return cnt;  
    }
}