class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if s=='':
            return True
        if len(s)>len(t):
            return False
        k=0
        for i in range(len(t)):
            if t[i]==s[k]:
                if k==len(s)-1:
                    return True
                k+=1
        return False