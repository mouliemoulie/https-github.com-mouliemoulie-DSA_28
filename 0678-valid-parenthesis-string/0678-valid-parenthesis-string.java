class Solution {
    public boolean checkValidString(String s) {
        if(s.length()==1) return false;
        if (s.length()==1 && s.charAt(0)=='*') return true;
        int mn=0;
        int mx=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                mn+=1;
                mx+=1;
            }
            else if(ch==')'){
                mn-=1;
                mx-=1;
            }
            else{
                mn-=1;
                mx+=1;
            }
            if(mn<0) mn=0;
            if(mx<0) return false;
        }
        return (mn==0);
    }
}