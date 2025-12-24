class Solution {
    static int n = 0;
    static int [][]dp;
    public static int helper(String s1, int i, int j){
      if(i>=j) return 0;
      if(dp[i][j]!=-1) return dp[i][j];
      if(s1.charAt(i)==s1.charAt(j)){
        return dp[i][j] = helper(s1, i+1, j-1);
      }

      return dp[i][j] = 1 + Math.min(helper(s1, i+1, j), helper(s1, i, j-1));
    }
    public int minInsertions(String s) {
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();

        n = s1.length(); 
        dp = new int[n][n];
        for(int []row: dp) Arrays.fill(row, -1);
        return helper(s1, 0, n-1); 
    }
}