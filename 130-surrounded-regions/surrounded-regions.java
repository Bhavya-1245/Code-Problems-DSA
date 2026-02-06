class Solution {
    static int n, m;

    static void dfs(char [][]board, int i, int j){
      if(i<0 || i>=n || j>=m || j<0 || board[i][j]!='O') return;
      
      board[i][j] = '*';

      dfs(board, i+1, j); // down
      dfs(board, i-1, j); // up
      dfs(board, i, j-1); // left
      dfs(board, i, j+1); // right
    }
    public void solve(char[][] board) {
        n = board.length; m = board[0].length;

        for(int i=0; i<n;i++){
          dfs(board, i, 0);
          dfs(board, i, m-1);
        }
        for(int i=0; i<m;i++){
          dfs(board, 0, i);
          dfs(board, n-1, i);
        }

        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(board[i][j] == '*'){
              board[i][j] = 'O';
            }else{
              board[i][j] = 'X';
            }
          }
        }
    }
}