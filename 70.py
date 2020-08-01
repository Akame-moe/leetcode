class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2
        dp = [0 for _ in range(n+1)]
        dp[1] = 1
        dp[2] = 2
        for x in range(3,n+1):
            dp[x] = dp[x-2] + dp[x-1]
        return dp[n]



if __name__ == '__main__':
	a = Solution()
	print(a.climbStairs(12))