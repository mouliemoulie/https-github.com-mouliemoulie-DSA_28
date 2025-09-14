class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        maxheap=[]
        for i in nums:
            heapq.heappush(maxheap,-i)
        res=-1
        while k>0:
            res=-heapq.heappop(maxheap)
            k-=1
        return res