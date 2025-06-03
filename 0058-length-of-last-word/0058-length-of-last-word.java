class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        int l=st[st.length-1].length();
        return l;
    }
}