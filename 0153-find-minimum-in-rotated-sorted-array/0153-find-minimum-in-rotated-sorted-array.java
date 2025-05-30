class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                h=mid-1;
            }
        }
        return min;
    }
}