class Solution {
    static int n, m;

    private static class Pair{
      int r, c;
      Pair(int r, int c){
        this.r = r;
        this.c = c;
      }
    }

    public int orangesRotting(int[][] grid) {
        n = grid.length; // rows;
        m = grid[0].length; // cols;

        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(grid[i][j] == 2) q.add(new Pair(i, j));
          }
        }
        int t = 0;
        while(!q.isEmpty()){
          int con = 0;
          int s = q.size();

          for(int i=0;i<s;i++){
            Pair p = q.poll();
          int r = p.r;
          int c = p.c;
          // int con = 0;
          if(r-1>=0 && grid[r-1][c]!= 0){
            if(grid[r-1][c]==1){
              grid[r-1][c] = 2;
              q.add(new Pair(r-1,c));
              con = 1;
            }
          }
          if(r+1<n && grid[r][c]!= 0){
            if(grid[r+1][c]==1){
              grid[r+1][c] = 2;
              q.add(new Pair(r+1,c));
              con = 1;
            }
          }
          if(c-1>=0 && grid[r][c-1]!= 0){
            if(grid[r][c-1]==1){
              grid[r][c-1] = 2;
              q.add(new Pair(r,c-1));
              con = 1;
            }
          }
          if(c+1<m && grid[r][c+1]!= 0){
            if(grid[r][c+1]==1){
              grid[r][c+1] = 2;
              q.add(new Pair(r,c+1));
              con = 1;
            }
          }
          }

          if(con == 1) t++;
        }

        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(grid[i][j]==1) return -1;
          }
        }

        return t;
    }
}