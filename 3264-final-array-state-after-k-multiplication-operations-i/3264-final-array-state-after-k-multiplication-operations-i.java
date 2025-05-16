class Solution {
    public int[] getFinalState(int[] nums, int k, int mu){
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->nums[i]!=nums[j]?nums[i]-nums[j]:i-j);
        for(int i=0;i<nums.length;i++){
            pq.add(i);
        }
        while(k-- >0){
            int ind=pq.poll();
            nums[ind]=nums[ind]*mu;
            pq.add(ind);
        }
        return nums;
        
    }
}