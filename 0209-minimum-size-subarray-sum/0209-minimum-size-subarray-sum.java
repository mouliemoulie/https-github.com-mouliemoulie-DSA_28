class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(l<=r && sum>=target){
               sum-=nums[l];
               minlength=Math.min(minlength,r-l+1);
               l++;
            }
            r++;
        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
        
    }
}