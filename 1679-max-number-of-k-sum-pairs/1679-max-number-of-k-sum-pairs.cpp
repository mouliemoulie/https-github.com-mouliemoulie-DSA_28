class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        int i=0;
        int j=nums.size()-1;
        int op=0;
        int sum=0;
        sort(nums.begin(),nums.end());
        while(i<j){
            sum=nums[i]+nums[j];
            if(sum==k){
                op++;
                i++;
                j--;
            }
            else if(sum<k) i++;
            else j--;
        }
        return op;
    }
};