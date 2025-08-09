class Solution {
public:
    vector<int> findColumnWidth(vector<vector<int>>& grid) {
        vector<int> res;
        int r=grid.size();
        int c=grid[0].size();
        for(int i=0;i<c;i++){
            int mx=-1;
            for(int j=0;j<r;j++){
                mx=max(helper(grid[j][i]),mx);
            }
            res.push_back(mx);
        }
        return res;
    }
    int helper(int k){
        int len=0;
        if(k<0){
            len=to_string(k).size();
        }
        else{
            len=to_string(k).size();
        }
        return len;
    }
};