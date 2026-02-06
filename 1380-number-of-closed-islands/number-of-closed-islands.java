class Solution {
    static int n, m;

    static void dfs(int [][]board, int i, int j){
      if(i<0 || i>=n || j>=m || j<0 || board[i][j]!=0) return;
      
      board[i][j] = 1;

      dfs(board, i+1, j); // down
      dfs(board, i-1, j); // up
      dfs(board, i, j-1); // left
      dfs(board, i, j+1); // right
    }
    static void dfs(int [][]board, int i, int j, boolean visited[][]){
      if(i<0 || i>=n || j>=m || j<0 || board[i][j]!=0 || visited[i][j]) return;
      
      visited[i][j] = true;

      dfs(board, i+1, j); // down
      dfs(board, i-1, j); // up
      dfs(board, i, j-1); // left
      dfs(board, i, j+1); // right
    }
    public int closedIsland(int[][] board) {
        n = board.length; m = board[0].length;

        for(int i=0; i<n;i++){
          dfs(board, i, 0);
          dfs(board, i, m-1);
        }
        for(int i=0; i<m;i++){
          dfs(board, 0, i);
          dfs(board, n-1, i);
        }
        int result = 0;
        boolean [][]visited = new boolean[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(board[i][j]==0 && !visited[i][j]){
              result++;
              dfs(board, i, j, visited);
            }
          }
        }
        return result;
    }
}