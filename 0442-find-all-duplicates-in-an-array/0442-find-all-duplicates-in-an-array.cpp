class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int> hm;
        vector<int> res;
        for(int i:nums){
            hm[i]++;
        }
        for(auto key:hm){
            if(key.second>1) res.push_back(key.first);
        }
        return res;
    }
};