class Solution {
public:
    int findChampion(vector<vector<int>>& grid) {
     int r=grid.size();
     int c=grid[0].size();
     for(int i=0;i<r;i++){
         int cnt1=0;
        for(int j=0;j<c;j++){
            if(grid[i][j]==1){
                cnt1++;
            }
            if(cnt1==r-1) return i;
        }
     }   
     return -1;
    }
};