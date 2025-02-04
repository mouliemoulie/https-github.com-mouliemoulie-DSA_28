class Solution {
    public int maxScore(int[] cpts, int k) {
        int sum=0;
        for(int i=0;i<k;i++) sum+=cpts[i];
        int max=sum;
        for(int i=k-1,j=cpts.length-1;i>=0;i--,j--){
            sum+=cpts[j]-cpts[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}