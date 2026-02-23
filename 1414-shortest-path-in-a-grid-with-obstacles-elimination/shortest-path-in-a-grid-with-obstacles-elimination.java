class Solution {

    static class Pair{
      int r, c, steps, k;

      Pair(int r, int c, int steps, int k){
        this.r = r;
        this.c = c;
        this.steps = steps;
        this.k = k;
      }
    }
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int [][]dir = {{-1, 0}, {1,0}, {0, -1}, {0,1}};

        boolean[][][] visited = new boolean[n][m][k+1];
        visited[0][0][k] = true;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, 0, k));

        int min_steps = Integer.MAX_VALUE;
        while(!q.isEmpty()){
          Pair p = q.poll();
            if(p.r==n-1 && p.c==m-1) return p.steps;
          
          for(int []d:dir){
            int nr = p.r + d[0];
            int nc = p.c + d[1];


            if(nr>=n || nc>=m || nr<0 || nc<0) continue;

            int nk = p.k - grid[nr][nc];

            if(nk>=0 && !visited[nr][nc][nk]){
              visited[nr][nc][nk] = true;
              q.add(new Pair(nr, nc, p.steps+1, nk));
            }
          }
          

          
          

        }
      return -1;
    }
}