class Solution {
    static int n = 0, m = 0;
    static int [][]dp;
    public static int helper(String s1, String s2, int i, int j){
      if(i>=n || j>=m) return 0;
      if(dp[i][j]!=-1) return dp[i][j];
      if(s1.charAt(i)==s2.charAt(j)){
        return dp[i][j] = 1 + helper(s1, s2, i+1, j+1);
      }

      return dp[i][j] = Math.max(helper(s1, s2, i+1, j), helper(s1, s2, i, j+1));
    }
    public int minInsertions(String s) {
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();

        n = s1.length(); m = s2.length();
        dp = new int[n][m];
        for(int []row: dp) Arrays.fill(row, -1);
        return s1.length() - helper(s1, s2, 0, 0); 
    }
}