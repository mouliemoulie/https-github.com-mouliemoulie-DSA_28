class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int r=matrix.size();
        int c=matrix[0].size();
        vector<vector<int>> temp(r,vector<int>(c));
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                temp[i][c-j-1]=matrix[j][i];
            }
        }
        matrix=temp;

    }
};