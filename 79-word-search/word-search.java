class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean [][]visit = new boolean[n][m];

        for(int i = 0; i<n; i++){
          for(int j = 0; j<m; j++){
            int k = 0;
            if(word.charAt(k) == board[i][j]){
                if(word(board, visit, i, j, word, 0, n, m)) return true;
            }
            
          }
        }

        return false;
    }

    public static boolean word(char[][] board, boolean[][] visit, int i, int j, 
    String word, int k, int row, int col){
      if(k==word.length()) return true;
      
      if(i<0 || j<0 || i>=row || j>=col || visit[i][j] || board[i][j] != word.charAt(k))    
          return false;
      
      
    
      visit[i][j] = true;
      if(word(board, visit, i+1, j, word, k+1, row, col)) return true; // for down;
      if(word(board, visit, i, j-1, word, k+1, row, col)) return true; // for left;
      if(word(board, visit, i, j+1, word, k+1, row, col)) return true; // for right;
      if(word(board, visit, i-1, j, word, k+1, row, col)) return true; // for up
      visit[i][j] = false;
      return false;
    }
}