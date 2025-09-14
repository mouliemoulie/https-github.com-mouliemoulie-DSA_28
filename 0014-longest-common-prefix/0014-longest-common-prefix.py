class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        s=sorted(strs)
        f=s[0]
        l=s[len(s)-1]
        res=""
        for i in range(0,min(len(f),len(l))):
            if f[i]!=l[i]:
                return res
            res+=f[i]
        return res
        