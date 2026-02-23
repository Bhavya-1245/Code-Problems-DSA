class Solution {

    static class Pair{
      int r, c, h;

      Pair(int r, int c, int h){
        this.r = r;
        this.c = c;
        this.h = h;
      }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int h) {
        int [][]dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        int n = grid.size(), m = grid.get(0).size();
        if(h - grid.get(0).get(0)<1) return false;

        boolean[][][] visited = new boolean[n][m][h+1];
        visited[0][0][h] = true;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, h - grid.get(0).get(0)));

        while(!q.isEmpty()){
          Pair p = q.poll();

          if(p.r==n-1 && p.c == m-1 && p.h>=1) return true;

          for(int []d:dir){
            int nr = p.r + d[0];
            int nc = p.c + d[1];

            if(nr>=n || nc>=m || nc<0 || nr<0) continue;

            int nh = p.h - grid.get(nr).get(nc);

            if(nh>=1 && !visited[nr][nc][nh]){
              q.add(new Pair(nr, nc, nh));
              visited[nr][nc][nh] = true;
            }
          } 
        }

        return false;
    }
}