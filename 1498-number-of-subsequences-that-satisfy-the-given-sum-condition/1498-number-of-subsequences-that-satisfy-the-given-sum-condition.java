class Solution {
    public int numSubseq(int[] nums, int t) {
    /* int sum=0;
        List<Integer> lst=new ArrayList<>();
        return nsub(nums,t,sum,0,lst);
    }
    private int nsub(int[] n,int t,int s,int indx,List<Integer> l){
        if(indx==n.length){
            if(!l.isEmpty()){
            int mx=Collections.max(l);
            int mn=Collections.min(l);
            if(mx+mn<=t) return 1;
            }
            return 0; 
        }
        l.add(n[indx]);
        int cnt=0;
        cnt+=nsub(n,t,s,indx+1,l);
        l.remove(l.size()-1);
        cnt+=nsub(n,t,s,indx+1,l);
        return cnt;
        */
        Arrays.sort(nums);
        int mod=1_000_000_007;
        int n=nums.length;
        int[] pow=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        int cnt=0;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]+nums[r]<=t){
                cnt=(cnt+pow[r-l])%mod;
                l++;
            }
            else r--;
        }
        return cnt;
    }
}