class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int c1=help(nums,k);
        int c2=help(nums,k-1);
        return c1-c2;
    }
    public int help(int[] nums,int k){
        int l=0;
        int r=0;
        int cnt=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<nums.length){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(l<nums.length && hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0) hm.remove(nums[l]);
                l++;
            }
            if(hm.size()<=k){
                cnt+=(r-l+1);
            }
            r++;
        }
        return cnt;
    }
}