class Solution(object):
    def reverseWords(self, s):
        s=s.split()
        res=" "
        for i in s[::-1]:
            res=res+i
            res+=" "
        res=res.strip()
        return res
            
                
                
        

        