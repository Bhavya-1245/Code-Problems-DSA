class Solution {
    public int climbStairs(int n) {
        if(n==0) return 1;
        if(n<0) return 0;
        int []dp = new int[n+1];
        dp[0] = 1;
        return total_chance(n, dp);
        
    }

    // recusrion

    // public static int total_chance(int n){
    //   if(n==0) return 1;
    //   if(n<0) return 0;

    //   return total_chance(n-1)+total_chance(n-2);
    // }

    // top down approach
    // public static int total_chance(int n, int []dp){
    //   if(n<0) return 0;
    //   if(n==0) return 1;

    //   if(dp[n]!=0) return dp[n];

    //   return dp[n] = total_chance(n-1, dp) + total_chance(n-2, dp);
    // }

    // bottom up approach
    public static int total_chance(int n, int[] dp){
      dp[1] = 1;
      for(int i=2; i<=n; i++){
        dp[i] = dp[i-1] + dp[i-2];

      }
      return dp[n];
    }
}