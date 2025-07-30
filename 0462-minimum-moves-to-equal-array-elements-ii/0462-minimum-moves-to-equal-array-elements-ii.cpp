class Solution {
public:
    int minMoves2(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int mid=nums.size()/2;
        int minmoves=0;
        for(int i:nums){
            if(i!=nums[mid]) minmoves+=abs(nums[mid]-i);
        }
        return minmoves;
    }
};