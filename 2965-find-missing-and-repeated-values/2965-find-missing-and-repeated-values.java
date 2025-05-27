class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
        int r=g.length;
        int c=g[0].length;
        int tot=r*r;
        int[] freq=new int[tot+1];
        int[] res=new int[2];
        int sum=0,mx=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                freq[g[i][j]]++;
            }
        }
        for(int i=1;i<=tot;i++){
            if(freq[i]==0) res[1]=i;
            else if(freq[i]==2) res[0]=i;
        }
        return res;
    }
}