class Solution {
public:
    char kthCharacter(int k) {
        string s="a";
        return rlc(k,s);
    }
    char rlc(int k,string s){
        string t="";
        if(s.size()>k) return s[k-1];
        for(int i=0;i<s.size();i++){
            t += (char)(s[i] + 1);
        }
        s+=t;
        return rlc(k,s);
    }
};