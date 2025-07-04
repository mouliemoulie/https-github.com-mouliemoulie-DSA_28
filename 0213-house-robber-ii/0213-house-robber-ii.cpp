class Solution {
public:
    int rob(vector<int>& nums) {
        vector<int> t1,t2;
        int n=nums.size();
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            if(i!=0) t1.push_back(nums[i]);
            if(i!=n-1) t2.push_back(nums[i]);
        }
        return max(helper(t1),helper(t2));
    }
private:
    int helper(vector<int>& temp){
        int n=temp.size();
        int prev=temp[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int pick=temp[i]+prev2;
            int notpick=0+prev;
            prev2=prev;
            prev=max(pick,notpick);
        }
        return prev;
    }
};