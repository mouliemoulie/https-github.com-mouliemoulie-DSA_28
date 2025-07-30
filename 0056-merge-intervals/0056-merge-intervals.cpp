class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        if(intervals.size()<=1) return intervals;
        sort(intervals.begin(),intervals.end());
        vector<int> newinterval=intervals[0];
        //res.push_back(newinterval);
        bool first=true;
        for(vector<int> interval:intervals){
            if(first){
                first=false;
                continue;
            }
            if(interval[0]<=newinterval[1]){ //overlapping
            newinterval[1]=max(interval[1],newinterval[1]);
            }
            else{//starting point anotther interval
              res.push_back(newinterval);
              newinterval=interval;
            }
        }
         res.push_back(newinterval); 
        return res;
    }
};