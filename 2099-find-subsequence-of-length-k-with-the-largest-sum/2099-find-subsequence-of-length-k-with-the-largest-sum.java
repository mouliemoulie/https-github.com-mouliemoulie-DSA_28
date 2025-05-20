class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] res=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            res[i][0]=nums[i];
            res[i][1]=i;
        }
        Arrays.sort(res,(a,b)->b[0]-a[0]);
        Arrays.sort(res,0,k,(a,b)->a[1]-b[1]);
        int[] seq=new int[k];
        for(int i=0;i<k;i++){
            seq[i]=res[i][0];
        }
        return seq;
    }
}