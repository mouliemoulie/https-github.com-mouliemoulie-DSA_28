class Solution {
    public String mergeAlternately(String w1, String w2) {
        int minlen=Math.min(w1.length(),w2.length());
        int i=0;
        StringBuilder res=new StringBuilder();
        while (i<minlen){
            res.append(w1.charAt(i));
            res.append(w2.charAt(i));
            i++;
        }
        if(w1.length()<w2.length()) res.append(w2.substring(minlen));
        else res.append(w1.substring(minlen));
        return res.toString();
        
    }
}