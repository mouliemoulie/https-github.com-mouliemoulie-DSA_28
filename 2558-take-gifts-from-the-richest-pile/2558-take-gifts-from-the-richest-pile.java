class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> gifts[b] - gifts[a]);
        for (int i = 0; i < gifts.length; i++) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            int idx = pq.poll();
            gifts[idx] = (int) Math.floor(Math.sqrt(gifts[idx]));
            pq.add(idx);
        }
        long sum = 0;
        for (int i : gifts) {
            sum += (long) i;
        }
        return sum;

    }
}