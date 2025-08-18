class Solution {
public:
    int maximumGap(vector<int>& nums) {
        int n=nums.size();
        if(n<=1) return 0;
        sort(nums.begin(),nums.end());
        int mx=INT_MIN;
        for(int i=1;i<n;i++){
            mx=max(mx,(nums[i]-nums[i-1]));
        }
        return mx;
    }
};