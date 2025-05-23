class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length <= 2) return nums.length; // Already valid
        
        int index = 2; // Start from the third element
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index; //
    }
}