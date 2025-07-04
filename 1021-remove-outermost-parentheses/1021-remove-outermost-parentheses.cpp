class Solution {
public:
    string removeOuterParentheses(string s) {
        string ans="";
        int cnt=0;
        for(char c:s){
            if (c==')') cnt-=1;
            if (cnt!=0) ans+=c;
            if(c=='(') cnt+=1;  
        }
        return ans;
    }
};