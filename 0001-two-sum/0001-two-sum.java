class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cmp=t-nums[i];
            if(hm.containsKey(cmp)) return new int[] {hm.get(cmp),i};
            hm.put(nums[i],i);
        }
        return new int[] {};
       }
}