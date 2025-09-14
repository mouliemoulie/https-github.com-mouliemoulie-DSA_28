class Solution(object):
    def kthSmallest(self, matrix, k):
        """
        :type matrix: List[List[int]]
        :type k: int
        :rtype: int
        """
        heap=[]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                heapq.heappush(heap,matrix[i][j])
        while k>1:
            heapq.heappop(heap)
            k-=1
        return heapq.heappop(heap)
        