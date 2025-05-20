class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int l=nums.length/2;
        for(int k:m.keySet()){
            if(m.get(k)>l) return k; 
        }
        return 0;
    }
}