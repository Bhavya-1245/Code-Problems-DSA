class Solution {
    // int ans = Integer.MAX_VALUE;

    // public int pathSum(int [][]grid, int i, int j, int m, int n, int [][]dp){
    //   if(i>=m || j>=n) return Integer.MAX_VALUE;
      
    //   if(i==m-1 && j==n-1){
    //     return grid[i][j];
    //   }
    //   if(dp[i][j]!=-1) return dp[i][j];

    //   int down = pathSum(grid, i+1, j, m, n, dp);
    //   int right = pathSum(grid, i, j+1, m, n, dp);
      
    //   return dp[i][j] = grid[i][j] + Math.min(down, right);
    // }

    public int minPathSum(int[][] grid) {
        int m = grid.length; // rows
        int n = grid[0].length; // cols
        int [][]dp = new int[m][n];

        for(int []row: dp) Arrays.fill(row, -1);

        dp[0][0] = grid[0][0];

        for(int i=1; i<m; i++){
          dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        for(int j=1; j<n; j++){
          dp[0][j] = grid[0][j] + dp[0][j-1];
        }

        for(int i=1; i<m; i++){
          for(int j=1; j<n; j++){
            int val = Math.min(dp[i-1][j], dp[i][j-1]);
            dp[i][j] = grid[i][j] + val;
          }
        }

        return dp[m-1][n-1];
    }


}