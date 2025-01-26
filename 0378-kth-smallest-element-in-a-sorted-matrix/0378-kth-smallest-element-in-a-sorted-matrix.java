class Solution {
    public int kthSmallest(int[][] mat, int k) {
        //if(mat.length==1 && k==1) return mat[0][0];
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add all elements to the heap
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                minHeap.offer(mat[i][j]);
            }
        }
        
        // Extract the first k-1 elements from the heap
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }
        
        // The kth smallest element is now at the top of the heap
        return minHeap.poll();
    }
}