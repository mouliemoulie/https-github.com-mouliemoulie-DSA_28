class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int mx=0;
        for(int i=0;i<s.length();i++){
            String t="";
            j=i;
            while(j<s.length() && (!t.contains(String.valueOf(s.charAt(j))))){
                t+=s.charAt(j);
                j++;
            }
            mx=Math.max(mx,t.length());
        }
        return mx;
    }
}