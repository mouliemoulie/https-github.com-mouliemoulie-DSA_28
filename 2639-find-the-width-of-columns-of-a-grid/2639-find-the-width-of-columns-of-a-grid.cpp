class Solution {
public:
    vector<int> findColumnWidth(vector<vector<int>>& grid) {
       
        int r=grid.size();
        int c=grid[0].size();
         vector<int> res(c,0);
        for(int i=0;i<c;i++){
            int mx=-1;
            for(int j=0;j<r;j++){
                int len=to_string(grid[j][i]).size();
                mx=max(mx,len);
            }
            res[i]=mx;
        }
        return res;
    }
};