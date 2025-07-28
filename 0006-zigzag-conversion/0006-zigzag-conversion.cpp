class Solution {
public:
    string convert(string s, int nr) {
        string mat[nr][s.size()];
        int r=0;
        int c=0;
        int i=0;
        while(i<s.size()){
            while(r<nr && i<s.size()){
                mat[r++][c]=s[i++];
            }
            r=max(0,r-2);
            while(r>0 && i<s.size()){
                mat[r--][++c]=s[i++];
            }
            c++;
        }
        string ans="";
        for(int j=0;j<nr;j++){
            for(int k=0;k<c;k++){
                ans+=mat[j][k];
            }
        }
        return ans;
    }
};