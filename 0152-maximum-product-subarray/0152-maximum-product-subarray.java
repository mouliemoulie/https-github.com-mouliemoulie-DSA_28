class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            max1=Math.max(product,max1);
            if(product==0) product=1;
        }
        product=1;
        int max2=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            product*=nums[i];
            max2=Math.max(product,max2);
            if(product==0) product=1;
        }
        return Math.max(max1,max2); 
       /* int l=0,r=0;
        int maxproduct=Integer.MIN_VALUE;
        while(r<nums.length){
            product*=nums[r];
            if(r+1<nums.length && nums[r]<=0){
                l=r+1;
            }
            maxproduct=Math.max(product,maxproduct);
            r++;
        }
        return maxproduct;*/
    }
}