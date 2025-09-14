import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, words, k):
        freq = Counter(words)
        heap = []

        for w, f in freq.items():
            # push (frequency, word) so heap sorts by freq first
            heapq.heappush(heap, (f, w))
            if len(heap) > k:
                heapq.heappop(heap)

        res = []
        while heap:
            # get the word (second element)
            res.append(heapq.heappop(heap)[1])

        return res[::-1]  # reverse to get highest freq first
