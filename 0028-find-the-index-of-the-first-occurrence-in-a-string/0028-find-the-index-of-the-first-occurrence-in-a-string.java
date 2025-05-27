class Solution {
    public int strStr(String hstk, String n) {
        char[] s=n.toCharArray();
        int cnt=0;
        int i=0;
        for(int j=0;j<hstk.length();j++){
            if(i<s.length && (s[i]==hstk.charAt(j))){
                cnt+=1;
                i++;
                if(cnt==n.length()){
                    return j-cnt+1;
                }
            }
            else {
                j = j - cnt;
                cnt=0;
                i=0;
            }
        }
        return -1; 
    }
}