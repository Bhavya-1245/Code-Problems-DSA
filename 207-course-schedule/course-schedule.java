class Solution {

    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean []path){
      visited[node] = true;
      path[node] = true;

      for(int ngh:adj.get(node)){
        if(!visited[ngh]){
          if(dfs(ngh, adj, visited, path)) return true;
        }
        else if(path[ngh]) return true;
      }

      path[node] = false;
      return false;
    }
    public boolean canFinish(int C, int[][] prerequisites) {
        boolean []visited = new boolean[C];
        boolean []path = new boolean[C];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<C;i++) adj.add(new ArrayList<>());
        for(int []ed:prerequisites){
          adj.get(ed[0]).add(ed[1]);
        }
        for(int i=0; i<C; i++){
          if(!visited[i]){
            if(dfs(i, adj, visited, path)) return false;
          }
        }

        return true;
    }
}