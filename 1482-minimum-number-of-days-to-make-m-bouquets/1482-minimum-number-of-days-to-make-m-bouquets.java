class Solution {
    public int minDays(int[] bd, int m, int k) {
        if ((long)m * k > bd.length) return -1;
        int l = bd[0];
        int mx = -1;
        //int ans=-1;
        for (int i : bd) {
            mx = Math.max(mx, i);
        }
        int h = mx;
        int d = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (flwr(bd, mid, m, k)) {
                d = mid;
                h = mid - 1;
            } else
                l = mid + 1;
        }
        return d;
    }

    private boolean flwr(int[] b,int mid,int m,int k){
        int bqt=0;
        int fc=0;
        for(int i=0;i<b.length;i++){
            if(b[i]<=mid){
                fc+=1;
                if(fc==k){
                    bqt+=1;
                    fc=0;
                }
            }
            else fc=0;
          }
        return bqt>=m;
    }

}  