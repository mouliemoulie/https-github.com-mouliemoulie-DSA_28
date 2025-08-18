class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        auto comp=[&](int a,int b){
            return heights[a]<heights[b];
        };
        priority_queue<int,vector<int>,decltype(comp)> pq(comp);
        int n=heights.size();
        for(int i=0;i<n;i++){
            pq.push(i);
        }
        vector<string> res;
        while(!pq.empty()){
            res.push_back(names[pq.top()]);
            pq.pop();
        }
        return res;
    }
};