class Solution {
    static int m, n;
    static boolean solve(char[][] board, boolean[][] visit, String s, int i, int j, int k){
      if(k == s.length()) return true;

      if(i<0 || i>m-1 || j<0 || j>n-1 || visit[i][j] || board[i][j]!=s.charAt(k)) return false;

      visit[i][j] = true;

      if(solve(board, visit, s, i+1, j, k+1)) return true;
      if(solve(board, visit, s, i, j-1, k+1)) return true;
      if(solve(board, visit, s, i, j+1, k+1)) return true;
      if(solve(board, visit, s, i-1, j, k+1)) return true;

      visit[i][j] = false;
      return false;
    }
    public boolean exist(char[][] board, String s) {
        m = board.length;
        n = board[0].length;
        boolean [][]visit = new boolean[m][n];
        for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
            if(board[i][j] == s.charAt(0)){
              if(solve(board, visit, s, i, j, 0)) return true;
            }
          }
        }
        return false;
    }
}