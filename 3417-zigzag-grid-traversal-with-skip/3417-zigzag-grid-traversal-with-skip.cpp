class Solution {
public:
    vector<int> zigzagTraversal(vector<vector<int>>& grid) {
        int r=grid.size();
        int c=grid[0].size();
        vector<int> res;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j+=2){
                if(i%2==0){
                    res.push_back(grid[i][j]);
                }
                else{
                    int colindx;
                    if(c%2==0){
                        colindx=c-j-1;
                    }
                    else{
                        colindx=c-j-2;
                    }
                    if(colindx>0 && colindx<c) res.push_back(grid[i][colindx]);
                }
            }
        }

        return res;
    }
};