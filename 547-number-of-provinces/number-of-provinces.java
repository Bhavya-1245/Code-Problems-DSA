class Solution {

    public static void bfs(int i, int [][]adj, boolean []visited){
      Queue<Integer> q = new LinkedList<>();
      visited[i] = true;
      q.add(i);

      while(!q.isEmpty()){
        int curr = q.poll();

        for(int j=0;j<adj[curr].length;j++){
          if(!visited[j] && adj[curr][j] == 1){
            q.add(j);
            visited[j] = true;
          }
        }
      }
    }
    public int findCircleNum(int[][] adj) {
        int count = 0;

         boolean visited[] = new boolean[adj.length];

          for(int i=0;i<adj.length;i++){
            if(!visited[i]){
              bfs(i, adj, visited);
              count++;
            }
          }

        return count;
    }
}