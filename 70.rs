impl Solution {
    pub fn climb_stairs(n: i32) -> i32 {
        let m = (n+1) as usize;
		if n < 3{
			return n;
		}
		let mut dp = (vec![0; m]).into_boxed_slice();
		dp[1] = 1;
		dp[2] = 2;
		for i in 3..m{
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n as usize];
    }
}