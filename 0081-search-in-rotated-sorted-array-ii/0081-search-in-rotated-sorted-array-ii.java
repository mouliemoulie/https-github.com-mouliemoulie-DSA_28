class Solution {
    public boolean search(int[] nums, int t) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==t) return true;
            if(nums[l]==nums[mid] && nums[mid]==nums[h]){
                l+=1;
                h-=1;
                continue;
            }
            if(nums[l]<=nums[mid]){
                if(nums[l]<=t && nums[mid]>=t) h=mid-1;
                else l=mid+1;
            }
            else{
                if(nums[mid]<=t && t<=nums[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return false;
    }
}