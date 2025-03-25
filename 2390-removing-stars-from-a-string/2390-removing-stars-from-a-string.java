class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='*') st.pop();
            else st.push(ch);
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}