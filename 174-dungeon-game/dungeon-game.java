class Solution {
    int dp[][];
    // recursive
    // public int helper(int [][]arr, int i, int j, int m, int n){
    //   if(i==m-1 && j==n-1) return arr[i][j]>=0 ? 1 : 1 - arr[i][j];
    //   if(i>=m || j>=n) return Integer.MAX_VALUE;

    //   int down = helper(arr, i+1, j, m, n);
    //   int right = helper(arr, i, j+1, m, n);

    //   int need = Math.min(down, right) - arr[i][j];
    //   return need<=0 ? 1 : need;
    // }

    // memoization
    public int helper(int [][]arr, int i, int j, int m, int n){
      if(i==m-1 && j==n-1) return arr[i][j]>=0 ? 1 : 1 - arr[i][j];
      if(i>=m || j>=n) return Integer.MAX_VALUE;
      if(dp[i][j]!=-1001) return dp[i][j];

      int down = helper(arr, i+1, j, m, n);
      int right = helper(arr, i, j+1, m, n);

      int need = Math.min(down, right) - arr[i][j];
      need = (need<=0) ? 1 : need;
      return dp[i][j] = need;
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        dp = new int[m][n];
        for(int []row: dp) Arrays.fill(row, -1001);
        return helper(dungeon, 0, 0, m, n);
    }
}