class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        if(nums.size()<k) return -1;
        int low=*max_element(nums.begin(),nums.end());
        int high=accumulate(nums.begin(),nums.end(),0);\
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int largsub=countsub(nums,mid);
            if(largsub<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private:
    int countsub(vector<int>& arr,int mxval){
        int arrsplit=1;
        int val=0;
        for(int i=0;i<arr.size();i++){
            if(val+arr[i]<=mxval){
                val+=arr[i];
            }
            else{
                arrsplit++;
                val=arr[i];
            }
        }
        return arrsplit;
    }
};