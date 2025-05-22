class Solution {
    public List<Integer> targetIndices(int[] nums, int t) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t) res.add(i);
        }
        return res;
    }
}