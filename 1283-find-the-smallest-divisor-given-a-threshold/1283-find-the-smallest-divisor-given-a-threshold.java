class Solution {
    public int smallestDivisor(int[] nums, int trsd) {
        int l=1;
        int h=0;
        for(int i:nums) h=Math.max(i,h);
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            int div=smldiv(nums,mid);
            if(div<=trsd){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
    return ans;
    }
    private int smldiv(int[] nums,int x){
        int sum=0;
        for(int i:nums){
            sum+=(int)Math.ceil(i/x);
        }
        return sum;
    }
}