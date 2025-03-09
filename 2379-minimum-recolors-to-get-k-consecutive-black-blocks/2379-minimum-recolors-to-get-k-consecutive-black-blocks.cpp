class Solution {
public:
    int minimumRecolors(string b, int k) {
        int m=INT_MAX;
        int wc=0;
        for(int i=0;i<k;i++){
            if(b[i]=='W') wc++;
        }
        m=wc;
        for(int i=k;i<b.length();i++){
            if(b[i]=='W') wc++;
            if(b[i-k]=='W') wc--;
            m=min(m,wc);
        }
        return m;
    }
};