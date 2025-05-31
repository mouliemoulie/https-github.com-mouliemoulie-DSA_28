class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }
            else if(ch=='['){
                st.push(']');
            }
            else if(ch=='{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=ch){
                return false;
            }
        }
        return st.isEmpty(); 
       /* int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') cnt+=1;
            else if (ch==')'|| ch==']' || ch=='}') cnt-=1;
            if(cnt<0) return false;
        }
        return true; */
    }
}