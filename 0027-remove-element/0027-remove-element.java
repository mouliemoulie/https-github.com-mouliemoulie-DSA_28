class Solution {
    public int removeElement(int[] nums, int v) {
        int indx=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=v){
                nums[indx]=nums[i];
                indx+=1;
            }
        }
        return indx;
    }
}