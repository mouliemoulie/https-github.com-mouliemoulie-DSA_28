class Solution {
    public boolean canJump(int[] nums) {
        int mxindx=0;
        for(int i=0;i<nums.length;i++){
            if(i>mxindx) return false;
            mxindx=Math.max(mxindx,i+nums[i]);
        }
        return true;
    }
}