class Solution {
    static int [][]dp;
    public static int path(int [][]grid, int i, int j, int m, int n){
      if(i>=m || j>=n || grid[i][j]==1) return 0;
      if(i==m-1 && j==n-1) return 1; 
      if(dp[i][j] != -1) return dp[i][j];

      int right = path(grid, i, j+1, m, n);
      int down = path(grid, i+1, j, m, n);      

      return dp[i][j] = right+down;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new int[m][n];
        for(int []row:dp) Arrays.fill(row, -1);
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;

        return path(obstacleGrid, 0, 0, m, n);

        
    }
}