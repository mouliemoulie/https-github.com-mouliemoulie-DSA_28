class Solution {
    public int mySqrt(int x) {
        if (x==1) return x;
        if (x==0) return x;
        int l=1;
        int h=x;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid*mid<=x){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
        return ans;
    }
}