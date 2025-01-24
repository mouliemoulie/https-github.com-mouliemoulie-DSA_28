class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            int t=0;
            for(int k=c-1;k>=0;k--){
                //if(t<c){
                    res[i][t++]=image[i][k]^1;
                //}
                //t++;
            }
        }
        //for(int m=0;m<r;m++){
            
            /*int k=0;
            for(int n=c-1;n>=0;n--){
                if(k<c){
                res[i][k]=image[i][k];
                k++;
                }
            }
        
        }*/
        return res;

    }
}