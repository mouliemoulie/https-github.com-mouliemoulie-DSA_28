class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int r=grid.size();
        int c=grid[0].size();
        vector<vector<int>> shiftmat(r,vector<int>(c,0));
        int shiftval=k%(r*c);
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    int indxin1d=((i*c+j)+shiftval)%(r*c);
                    int newrow=indxin1d/c;
                    int newcol=indxin1d%c;
                    shiftmat[newrow][newcol]=grid[i][j];
          }
        }
        return shiftmat;
    }
};