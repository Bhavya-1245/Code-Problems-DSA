class Solution {
    static int n = 0;
    static int [][]dp;

    public static int solve(int []coins, int amt, int i){
      if(amt == 0) return 1;
      if(i<0 || amt<0) return 0;
      if(dp[i][amt]!=-1) return dp[i][amt];
      int take = solve(coins, amt - coins[i], i);
      int skip = solve(coins, amt, i-1);

      return dp[i][amt] = take+skip;
    }

    public int change(int amount, int[] coins) {
        n = coins.length;
        dp = new int[n][amount+1];

        for(int []row: dp) Arrays.fill(row, -1);


        int ans = solve(coins, amount, n-1);

        return ans == 10000 ? 0 : ans;
    }
}