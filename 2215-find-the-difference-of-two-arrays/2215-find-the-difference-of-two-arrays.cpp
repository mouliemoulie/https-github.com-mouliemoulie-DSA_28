class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int>s1,s2;
        vector<int> v1,v2;
        vector<vector<int>> ans;
        for(auto x: nums1) s1.insert(x);
        for(auto x: nums2) s2.insert(x);
        for(auto n:s1){
            if(!s2.count(n)) v1.push_back(n);
        }
        for(auto n:s2){
            if(!s1.count(n)) v2.push_back(n);
        }
        ans.push_back(v1);
        ans.push_back(v2);
        return ans;
    }
};