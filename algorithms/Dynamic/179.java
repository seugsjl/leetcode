public class Solution {
    public int numSquares(int n) {
	    int dp[] = new int[n + 1];
	    for (int i = 1; i * i <= n; i++) {
	      dp[i * i] = 1;
	    }
	    for (int i = 1; i <= n; i++) {
	      for (int j = 1; i + j * j <= n; j++) {
	        if (dp[i + j * j] == 0 || dp[i + j * j] > dp[i] + 1) {
	          dp[i + j * j] = dp[i] + 1;
	        }
	      }
	    }
	    return dp[n];        
    }
}
