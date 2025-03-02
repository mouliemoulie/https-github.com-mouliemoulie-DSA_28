class Solution {
    public String firstPalindrome(String[] w){
         for(int i=0;i<w.length;i++){
            String t=w[i];
            String revw=new StringBuilder(w[i]).reverse().toString();
            if(t.equals(revw)) return t;
         }
         return "";
    }
}