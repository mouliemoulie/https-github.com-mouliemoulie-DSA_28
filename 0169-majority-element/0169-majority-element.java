class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        if(nums.length==1) return nums[0];
        int l=nums.length/2;
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>l) return i; 
        }
        return -1;
    }
}