class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int []edge:edges){
          adj.get(edge[0]).add(edge[1]);
          adj.get(edge[1]).add(edge[0]);
        }
        boolean visited[] = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        visited[source] = true;
        
        while(!q.isEmpty()){
          int curr = q.poll();

          for(int nb:adj.get(curr)){
            if(!visited[nb]){
              visited[nb] = true;
              q.add(nb);
            }
          }
        }

        return visited[destination];
    }
}