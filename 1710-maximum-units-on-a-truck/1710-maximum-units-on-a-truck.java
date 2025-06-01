class Solution {
    public int maximumUnits(int[][] b, int ts) {
        Arrays.sort(b,(x,y)->y[1]-x[1]);
        int tot=0;
        for(int i=0;i<b.length;i++){
            int bxt=Math.min(b[i][0],ts);
            tot+=(bxt*b[i][1]);
            ts-=bxt;
            if (ts == 0) break;
        }
        return tot;
    }
}