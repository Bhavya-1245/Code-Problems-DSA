class Solution {
    static int n,m;

    public static int dfs(int [][]grid, int i, int j, boolean[][] visited){
      if(i>n-1 || j>m-1 || i<0 || j<0 || grid[i][j] == 0) return 1;
      if(visited[i][j]) return 0;

      visited[i][j] = true;

      int up = dfs(grid, i-1, j, visited);
      int down = dfs(grid, i+1, j, visited);
      int right = dfs(grid, i, j+1, visited);
      int left = dfs(grid, i, j-1, visited);

      return up + down + right + left;
    }
    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        int result = 0;

        boolean visited[][] = new boolean[n][m];

        for(int i=0;i<n;i++){
          for(int j=0; j<m; j++){
            if(grid[i][j] == 1){
              return dfs(grid, i, j, visited);
            }
          }
        }

        return 0;
    }
}