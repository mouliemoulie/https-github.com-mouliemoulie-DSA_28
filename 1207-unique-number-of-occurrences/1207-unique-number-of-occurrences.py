class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        seen=set()
        fre=Counter(arr)
        for i,f in fre.items():
            if(f in seen):
                return False
            seen.add(f)
        return True