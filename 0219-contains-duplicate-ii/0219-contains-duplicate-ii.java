class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }
            else{
                int j = hashMap.get(nums[i]);
                if(Math.abs(i-j) <= k)
                return true;
                else
                hashMap.put(nums[i], i);
            }
        }
        return false;

        
    }
}