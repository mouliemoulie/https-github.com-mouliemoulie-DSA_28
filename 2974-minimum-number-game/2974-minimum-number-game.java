class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->x-y);
        int k=0;
        for(int n:nums){
            pq.add(n);
        }
        for(int i=0;i<nums.length/2;i++){
                int al=pq.poll();
                int bob=pq.poll();
                res[k++]=bob;
                res[k++]=al;
            }
        return res;
    }
}