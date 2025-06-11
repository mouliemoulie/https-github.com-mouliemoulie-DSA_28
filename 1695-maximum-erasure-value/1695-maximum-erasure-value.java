class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int r=0,l=0,mx=0,sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<nums.length){
            int re=nums[r];
            hm.put(re,hm.getOrDefault(re,0)+1);
            sum+=re;
            while(hm.get(re)>1){
                int le=nums[l];
                hm.put(le,hm.get(le)-1);
                sum-=le;
                if(hm.get(le)==0) hm.remove(le);
                l++;
            }
            mx=Math.max(mx,sum);
            r++;
        }
        return mx;
    }
}