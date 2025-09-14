class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        carry=1
        l=[]
        for i in range(len(digits)-1,-1,-1):
            v=digits[i]+carry
            digits[i]=v%10
            carry=v//10
        if carry>0:
            digits.insert(0,carry)
        return digits
            