/*class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Math.min(lsub(nums,l),rsub(nums,r));
         return ans != Integer.MAX_VALUE ? ans : -1;
    }
    private int lsub(List<Integer> nums,int l){
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            sum+=nums.get(i);
        }
        if(sum>0) min=sum;
        for(int i=l;i<nums.size();i++){
            sum+=nums.get(i)-nums.get(i-l);
            if(sum<min && sum>0) min=sum;
        }
        return min;
    }
    private int rsub(List<Integer> nums,int r){
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            sum+=nums.get(i);
        }
        if(sum>0) min=sum;
        for(int i=r;i<nums.size();i++){
            sum+=nums.get(i)-nums.get(i-r);
            if(sum<min && sum>0) min=sum;
        }
        return min;
    }
}*/
import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int minSum = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int currSum = 0;

            for (int j = 0; j < i; j++) {
                currSum += nums.get(j);
            }
            if (currSum > 0) {
                minSum = Math.min(minSum, currSum);
            }

            int low = 0, high = i;

            while (high < nums.size()) {
                currSum -= nums.get(low);
                currSum += nums.get(high);

                low++;
                high++;

                if (currSum > 0) {
                    minSum = Math.min(minSum, currSum);
                }
            }
        }
        if (minSum == Integer.MAX_VALUE) return -1;
        return minSum;
    }
}