class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
        /*int i=0;
        int l=nums.length;
        int indx=-1;
        while(i<l){
            if(nums[i]==t) return i;
            else if(i+1<l && t>nums[i] && t<nums[i+1]) indx=i+1;
            else if(t<nums[i] && t<nums[i+1])
        }*/

    }
}