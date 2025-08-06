class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int l=0;
        int r=0;
        int zc=0;
        int mxl=INT_MIN;
        while(r<nums.size()){
            if(nums[r]==0){
                zc++;
            }
            while(zc>1){
                if(nums[l]==0) zc--;
                l++;
            }
            mxl=max(mxl,(r-l+1)-zc);
            r++;
        }
        if(zc==0) return nums.size()-1;
        return mxl;
    }
};