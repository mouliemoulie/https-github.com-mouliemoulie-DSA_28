class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& c) {
        //int l=0;
        int res = 0; // There is always at least one group
        int len = c.size();
        if (len<3) return res;
        for (int i = 0; i < len; i++) {
            int prev=c[(i-1+len)%len];
            int cur=c[i];
            int next=c[(i+1)%len];
            if (cur!=prev && cur!=next) { 
                res++; // Only count when a new group starts
            }
        }
        return res;
    }
};