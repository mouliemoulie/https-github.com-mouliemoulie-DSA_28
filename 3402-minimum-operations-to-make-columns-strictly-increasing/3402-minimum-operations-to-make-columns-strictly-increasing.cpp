class Solution {
public:
    int minimumOperations(vector<vector<int>>& matrix) {
        int opcnt=0;
        int r=matrix.size();
        int c=matrix[0].size();
        for(int i=0;i<c;i++){
            for(int j=1;j<r;j++){
                if(matrix[j][i]<=matrix[j-1][i]){
                    opcnt+=((matrix[j-1][i]-matrix[j][i])+1);
                    matrix[j][i]+=((matrix[j-1][i]-matrix[j][i])+1);
                    
                }
            }
        }
        return opcnt;
    }
};