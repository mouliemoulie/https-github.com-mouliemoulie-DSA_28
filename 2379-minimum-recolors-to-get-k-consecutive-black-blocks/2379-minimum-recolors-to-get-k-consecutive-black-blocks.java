class Solution {
    public int minimumRecolors(String b, int k) {
        int wc=0;
        int minw=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W') wc++;
        }
        minw=wc;
        for(int i=k;i<b.length();i++){
            if(b.charAt(i)=='W') wc++;
            if(b.charAt(i-k)=='W') wc--;
            minw=Math.min(wc,minw);
        }
        return minw;
    }
}