class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int discnt = unique.size();
        return help(nums,discnt) - help(nums,discnt-1);
    }
    private int help(int[] nums,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=0,l=0,cnt=0;
        while(r<nums.length){
            int re=nums[r];
            hm.put(re,hm.getOrDefault(re,0)+1);
            if(hm.size()>k){
                int le=nums[l];
                hm.put(le,hm.get(le)-1);
                if(hm.get(le)==0) hm.remove(le);
                l++;
            }
            if(hm.size()<=k) cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}