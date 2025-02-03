class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sl=0;
        int sr=0;
        int maxlen=Integer.MIN_VALUE;
        while(sr<s.length()){
            String temp="";
            while(sr<s.length() && !temp.contains(String.valueOf(s.charAt(sr)))){
                temp+=s.charAt(sr);
                sr++;
            }
            sl++;
            sr=sl;
            maxlen=Math.max(maxlen,temp.length());
            temp="";
        }
        return maxlen;
    }
}