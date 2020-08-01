# -*- coding: UTF-8 -*-

class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = 0
        d = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        for i in range(len(s)):
        	val = d[s[i]]
        	if (i == len(s)-1 or d[s[i+1]] <= d[s[i]]):
        		res += val
        	else:
        		res -= val
        return res

if __name__ == '__main__':
	a = Solution()
	print(a.romanToInt('MCMLXXX'))