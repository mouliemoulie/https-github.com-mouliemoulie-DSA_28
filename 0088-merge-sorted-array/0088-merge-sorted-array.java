class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> x - y);
        while (i < m) pq.add(nums1[i++]);
        while(j < n) pq.add(nums2[j++]);
        int k = 0;
        while (!pq.isEmpty()) {
                nums1[k++] = pq.poll();
        }
    }
}