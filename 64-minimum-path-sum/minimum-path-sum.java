class Solution {
    int ans = Integer.MAX_VALUE;

    public int pathSum(int [][]grid, int i, int j, int m, int n, int [][]dp){
      if(i>=m || j>=n) return Integer.MAX_VALUE;
      
      if(i==m-1 && j==n-1){
        return grid[i][j];
      }
      if(dp[i][j]!=-1) return dp[i][j];

      int down = pathSum(grid, i+1, j, m, n, dp);
      int right = pathSum(grid, i, j+1, m, n, dp);
      
      return dp[i][j] = grid[i][j] + Math.min(down, right);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length; // rows
        int n = grid[0].length; // cols
        int [][]dp = new int[m][n];

        for(int []row: dp) Arrays.fill(row, -1);

        return pathSum(grid, 0, 0, m, n, dp);

        
    }


}