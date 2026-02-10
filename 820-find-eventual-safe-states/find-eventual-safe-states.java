class Solution {
    static int v, e;

    public static boolean dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean []visited, boolean []path){
      visited[src] = true;
      path[src] = true;

      for(int ngh:adj.get(src)){
        if(!visited[ngh]){
          if(dfs(ngh, adj, visited, path)) return true;
        }else if(path[ngh]) return true;
      }

      path[src] = false;
      return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        v = graph.length;
        //e = graph[0].length;
        for(int i=0; i<v; i++){
          adj.add(new ArrayList<>());
        }

        for(int i=0;i<v;i++){
          int e = graph[i].length;
          for(int j=0;j<e;j++){
            adj.get(i).add(graph[i][j]);
          }
        }
        boolean []path = new boolean[v];
        boolean []visited = new boolean[v];
        boolean res = false;
        for(int i=0;i<v;i++){
          if(!visited[i]){
            if(dfs(i, adj, visited, path)) res = true;
          }
        
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<v;i++){
          if(!path[i]) ans.add(i);
        }

        Collections.sort(ans);

        return ans;
        
    }
}