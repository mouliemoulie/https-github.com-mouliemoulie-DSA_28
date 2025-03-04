class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long res=0;
        if(nums.length%2==1){
            res+=nums[nums.length/2];
        }
        while(i<j){
            res+=Long.parseLong(String.valueOf(nums[i++]) + String.valueOf(nums[j--]));
        }
        return res;
    }
}