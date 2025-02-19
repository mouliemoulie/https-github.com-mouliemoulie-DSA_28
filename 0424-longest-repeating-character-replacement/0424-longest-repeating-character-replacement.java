class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int[] arr=new int[26];
        int mxf=0;
        int mxw=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            mxf=Math.max(mxf,arr[s.charAt(i)-'A']);
            int ws=i-l+1;
            if(ws-mxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            ws=i-l+1;
            mxw=Math.max(mxw,ws);
        }
        return mxw;
    }
}