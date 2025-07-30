class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->Double.compare(arr[x[0]]/(double)arr[x[1]], arr[y[0]]/(double)arr[y[1]]));
       int n = arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            pq.offer(new int[]{i,j});
        }
       }
        while(--k>0){
            pq.poll();
        }
        int[] top=pq.poll();
        //int[] res=new int[2];
       // res[0]=arr[top[0]];
        //res[1]=arr[top[1]];
        return new int[]{arr[top[0]],arr[top[1]]};
    }
}