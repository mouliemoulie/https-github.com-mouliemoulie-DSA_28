class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0f;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            double avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }
        return maxavg;
    }
}