class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mxcnt=-1;
        int i=0;
        while(i<nums.length){
            int cnt=0;
            while(i<nums.length && nums[i]==1){
                i+=1;
                cnt+=1;
            }
            if(cnt>mxcnt) mxcnt=cnt;
            i+=1;
        }
        return mxcnt;

    }
}