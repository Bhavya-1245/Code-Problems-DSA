class Solution {
    static int n = 0;
    static int []dp;

    // public static int solve(int []coins, int i, int amt){
    //   if(amt == 0) return 0;
    //   if(amt<0) return 100000;
    //   if(i<0) return 100000;
    //   if(dp[i][amt]!=-1) return dp[i][amt];
    //   int take = 1 + solve(coins, i, amt - coins[i]);

      

    //   int skip = solve(coins, i - 1, amt);

    //   return dp[i][amt] = Math.min(take, skip);
    // }

    public int coinChange(int[] coins, int amount) {
        n = coins.length;
        dp = new int[amount+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int c:coins){
          for(int sum = c; sum<=amount; sum++){
              if(dp[sum-c]==Integer.MAX_VALUE) continue;
              dp[sum] = Math.min(dp[sum], 1 +dp[sum - c]);
          }
        }
        
        // for(int []col: dp) Arrays.fill(col, -1);
        
        // int ans = solve(coins, n-1, amount);

        return dp[amount]>=Integer.MAX_VALUE ? -1 : dp[amount];
    }
}