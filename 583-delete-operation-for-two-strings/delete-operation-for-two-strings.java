class Solution {
    static int n = 0, m = 0;
    static int [][]dp;
    public static int helper(String s1, String s2, int i, int j){
      if(i>=m || j>=n) return 0;
      if(dp[i][j]!=-1) return dp[i][j];
      int ans = 0;

      if(s1.charAt(i) == s2.charAt(j)){
        return dp[i][j] = 1 + helper(s1, s2, i+1, j+1);
      }
      return dp[i][j] = Math.max(helper(s1, s2, i+1, j), helper(s1, s2, i, j+1));
      

      
    }

    public int minDistance(String word1, String word2) {
        n = word2.length();
        m = word1.length();
        dp = new int[m][n];
        for(int []row:dp) Arrays.fill(row, -1);
        int ans = helper(word1, word2, 0, 0);
        ans = (n+m) - 2*ans;
        return ans;
    }
}