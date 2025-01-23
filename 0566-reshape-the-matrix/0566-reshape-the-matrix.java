class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matr=mat.length;
        int matc=mat[0].length;
        int[][] res=new int[r][c];
        if(matr*matc != r*c) return mat;
        //f(mat.length== && mat[0].length==c) return mat;
        int resr=0;
        int resc=0;
        for(int i=0;i<matr;i++){
            for(int j=0;j<matc;j++){
                     res[resr][resc]=mat[i][j];
                     resc++;
                     if(resc==c){
                        resr++;
                        resc=0;
                     }
            }
        }
        return res;
    }
}