class Solution {
    static int [][]dp;
    // public static int path(int [][]grid, int i, int j, int m, int n){
    //   if(i>=m || j>=n || grid[i][j]==1) return 0;
    //   if(i==m-1 && j==n-1) return 1; 
    //   if(dp[i][j] != -1) return dp[i][j];

    //   int right = path(grid, i, j+1, m, n);
    //   int down = path(grid, i+1, j, m, n);      

    //   return dp[i][j] = right+down;
    // }
    
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m = obstacleGrid.length;
    //     int n = obstacleGrid[0].length;
    //     dp = new int[m][n];
    //     for(int []row:dp) Arrays.fill(row, -1);
    //     if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;

    //     return path(obstacleGrid, 0, 0, m, n);

        
    // }

    public int uniquePathsWithObstacles(int [][]grid){
      int m = grid.length;
      int n = grid[0].length;
      dp = new int[m][n];
      if(grid[0][0] == 1) return 0;
      dp[0][0] = 1;

      for(int i=1;i<m;i++){
        if(grid[i][0]==1) dp[i][0] = 0;
        else dp[i][0] = dp[i-1][0];
      }
      for(int i=1;i<n;i++){
        if(grid[0][i]==1) dp[0][i] = 0;
        else dp[0][i] = dp[0][i-1];
      }

      for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
          if(grid[i][j]==1) dp[i][j] = 0;
          else dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
      }

      return dp[m-1][n-1];
    }
}