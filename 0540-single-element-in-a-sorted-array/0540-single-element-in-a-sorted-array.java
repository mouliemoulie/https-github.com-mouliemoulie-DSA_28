class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len=nums.length;
        if(len==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[len-1]!=nums[len-2]) return nums[len-1];
        int l=1;
        int h=len-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            else if(mid%2!=0 && nums[mid]==nums[mid-1]) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}