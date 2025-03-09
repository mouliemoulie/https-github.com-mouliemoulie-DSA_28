class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& c, int k) {
        int res=0;
        int l=0;
        int len=size(c);
        for(int r=1;r<(len+k-1);r++){
            if(c[r%len]==c[(r-1)%len]) l=r;
            if(r-l+1>k) l+=1;
            if(r-l+1==k) res+=1;
        }
        return res;
    }
};