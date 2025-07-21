class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int l=nums.size();
        k=k%l;
        vector<int> temp(l);
        for(int i=0;i<k;i++){
            temp[i]=nums[l-k+i];
        }
        for(int i=k;i<l;i++){
            temp[i]=nums[i-k];
        }
        for(int i=0;i<l;i++){
            nums[i]=temp[i];
        }
    }
};