class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& c) {
       if(c[0][0]-c[0][1]==0) return false;
       else return true;
    }
};