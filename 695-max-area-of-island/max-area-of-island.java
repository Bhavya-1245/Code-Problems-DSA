class Solution {
    static int n,m;
    int count = 0;

    public static int dfs(int i, int j, int [][]grid){
      if(i>=n || i<0 || j>=m || j<0 || grid[i][j] == 0 ) return 0;

      grid[i][j] = 0;

      int up = dfs(i-1, j, grid);
      int down = dfs(i+1, j, grid);
      int left = dfs(i, j-1, grid);
      int right = dfs(i, j+1, grid);

      return 1 + up + down + left + right;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        n = grid.length;
        m = grid[0].length;
        boolean visited[][] = new boolean[n][m];

        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(grid[i][j] == 1){
              
              int area = dfs(i, j, grid);
              ans = Math.max(ans, area);

            }
          }
        }
        return ans;
    }
}