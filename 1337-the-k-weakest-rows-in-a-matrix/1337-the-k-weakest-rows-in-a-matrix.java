class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            m.put(i,sum);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->m.get(a)!=m.get(b)?m.get(a)-m.get(b):a-b);
        for(int key:m.keySet()) {
            pq.offer(key);
        }
        int[] res = new int[k];
        int i = 0;
        while (i < k) {
            res[i] = pq.poll();
            i++;
        }
        return res;
    }
}