class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        /*String res="";
        for(String w:words){
            String revw=new StringBuilder(w).reverse().toString();
            String uprevw=String.join(" ",revw);
            res+=uprevw;
        }*/
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            res.append(new StringBuilder(words[i]).reverse());
            if(i<words.length-1) res.append(" ");
        }
        return res.toString();
    }
}