class Solution {
    public String reverseWords(String s) {
        String[] strarr=s.trim().split("\\s+");
        //Stack<String> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=strarr.length-1;i>=0;i--){
            res.append(strarr[i]);
            if(i!=0) res.append(" ");
        }

       return res.toString();
    }
}