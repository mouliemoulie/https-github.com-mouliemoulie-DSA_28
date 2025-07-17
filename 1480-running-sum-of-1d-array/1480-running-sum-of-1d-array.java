class Solution {
    public int[] runningSum(int[] nums) {
        int prefixsum=0;
        int[] res=new int[nums.length];
        int k=0;
        for(int i:nums){
            prefixsum+=i;
            res[k++]=prefixsum;
        }
        return res;
    }
}