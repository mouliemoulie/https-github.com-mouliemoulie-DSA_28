class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int tot=0;
            if(k>0){
            for(int j=1;j<=k;j++) tot+=code[(i+j)%n];
            }
            else if (k<0){
            for(int j=1;j<=-k;j++) tot+=code[(i-j+n)%n];
            }
            res[i]=tot;
        }
        return res;
    }
}