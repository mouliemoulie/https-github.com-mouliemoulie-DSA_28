class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] res=new int[]{-1,-1};
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<t){
                l=mid+1;
            }
            else  h=mid-1;
        }
        if(l >= nums.length || nums[l]!=t) return res;
        res[0]=l;
        h=nums.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>t){
                h=mid-1;
            }
            else  l=mid+1;
        }
        res[1]=h;
        return res;

    }
}