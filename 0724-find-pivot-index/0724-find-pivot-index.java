class Solution {
    public int pivotIndex(int[] nums) {
         // Compute the total sum of the array
         int totalSum = 0, leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i]; // Update left sum
        }

        return -1; // No pivot index found 
        }
}