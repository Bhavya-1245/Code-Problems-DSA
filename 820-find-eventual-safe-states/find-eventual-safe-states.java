class Solution {
    static int v;

    public static boolean dfs(int src, int[][] adj, boolean []visited, boolean []path){
      visited[src] = true; // reach that node
      path[src] = true; // also associated with visited

      for(int ngh=0; ngh<adj[src].length;ngh++){
        if(!visited[adj[src][ngh]]){
          if(dfs(adj[src][ngh], adj, visited, path)) return true;
        }else if(path[adj[src][ngh]]) return true;
      }

      path[src] = false; // backtrack as cycle not detected
      return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        v = graph.length; // no of vertices
        
        boolean []path = new boolean[v]; // path for an idea about passed through visiting
        boolean []visited = new boolean[v]; 
        boolean res = false; // no use
        List<Integer> ans = new ArrayList<>(); // contains safe or terminal nodes
        for(int i=0;i<v;i++){
          if(!visited[i]){
            if(dfs(i, graph, visited, path)){ // call dfs to detect cycle
              res = true;
            }
          }
        
        }


        for(int i=0;i<v;i++){
          if(!path[i]) ans.add(i); // add index those are detected as non cycle
        }

        Collections.sort(ans);

        return ans;
        
    }
}