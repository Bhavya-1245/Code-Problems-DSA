class Solution {
    static int n = 0, m = 0;
    static int [][]dp;
    // public static int helper(String s1, String s2, int i, int j){
    //   if(i>=m || j>=n) return 0;
    //   if(dp[i][j]!=-1) return dp[i][j];
    //   int ans = 0;

    //   if(s1.charAt(i) == s2.charAt(j)){
    //     return dp[i][j] = 1 + helper(s1, s2, i+1, j+1);
    //   }
    //   return dp[i][j] = Math.max(helper(s1, s2, i+1, j), helper(s1, s2, i, j+1));
      

      
    // }

    public int longestCommonSubsequence(String s1, String s2) {
        n = s2.length();
        m = s1.length();
        dp = new int[m+1][n+1];
        
        for(int i=0;i<=n; i++){
          dp[0][i] = 0;
        }
        for(int i=0;i<=m; i++){
          dp[i][0] = 0;
        }
        
        for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
              dp[i][j] = 1 + dp[i-1][j-1];
            }else{
              dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
          }
        }

        return dp[m][n];
        
    }
}