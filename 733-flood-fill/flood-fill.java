class Solution {
    int n, m;

    private static class Pair{
      int r, c;
      Pair(int r, int c){
        this.r = r;
        this.c = c;
      }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int img = image[sr][sc];
        if(img == color) return image;
        n = image.length; // rows
        m = image[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        image[sr][sc] = color;

        while(!q.isEmpty()){
          Pair p = q.poll();
          int r = p.r;
          int c = p.c;

          if(r-1>=0 && image[r-1][c] == img){
            image[r-1][c] = color;
            q.add(new Pair(r-1, c));
          }
          if(r+1<n && image[r+1][c] == img){
            image[r+1][c] = color;
            q.add(new Pair(r+1, c));
          }
          if(c+1<m && image[r][c+1] == img){
            image[r][c+1] = color;
            q.add(new Pair(r, c+1));
          }
          if(c-1>=0 && image[r][c-1] == img){
            image[r][c-1] = color;
            q.add(new Pair(r, c-1));
          }
        }

        return image;
    }
}