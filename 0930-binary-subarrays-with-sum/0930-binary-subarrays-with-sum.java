class Solution {
    public int numSubarraysWithSum(int[] nums, int g) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int cnt=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(h.get(sum-g)!=null){
                cnt=cnt+h.get(sum-g);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return cnt++;
    }
}