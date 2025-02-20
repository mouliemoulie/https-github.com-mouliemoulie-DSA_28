class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //int n = nums.length;
        Map<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int n=nums.length;
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=(nums[i]%2!=0)?1:0;
            if(h.get(sum-k)!=null){
                ans+=h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}