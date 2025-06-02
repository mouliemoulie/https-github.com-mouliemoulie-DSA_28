class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int mx=0;
        int z=0;
        while(r<nums.length){
            if(nums[r]==0) z++;
            if(z>k){
                if(nums[l]==0) z--;
                l++;
            }
            if(z<=k){
                mx=Math.max(mx,r-l+1);
            }
            r++;
        }
        return mx;
    }
}