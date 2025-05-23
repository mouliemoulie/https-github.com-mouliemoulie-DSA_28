class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==t) return mid;
            if(nums[l]<= nums[mid]){
                if(nums[l]<=t && t<=nums[mid]) h=mid-1;
                else l=mid+1;
            }
            else{
                if(nums[mid]<=t && t<=nums[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return -1;
    }
}