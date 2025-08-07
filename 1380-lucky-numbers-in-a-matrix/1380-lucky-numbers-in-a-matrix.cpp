class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        vector<int> res;
        for(int i=0;i<matrix.size();i++){
            int rmin=INT_MAX;
            int col=-1;
            for(int j=0;j<matrix[0].size();j++){
               if(matrix[i][j]<rmin){
                rmin=matrix[i][j];
                col=j;
               }
            }
            bool f=true;
            for(int k=0;k<matrix.size();k++){
                if(rmin<matrix[k][col]) {
                    f=false;
                    break;
                }
            }
            if(f) res.push_back(rmin);
        }
        return res;
    }
};