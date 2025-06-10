class MedianFinder {
   PriorityQueue<Integer> maxHeap; // lower half (max-heap)
   PriorityQueue<Integer> minHeap; // upper half (min-heap)

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((x,y)->y-x);
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        
        // Step 3: Balance the heaps
        // maxHeap should always have the same number or 1 more than minHeap
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */