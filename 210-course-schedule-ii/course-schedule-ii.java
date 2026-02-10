class Solution {

    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] path,
    Stack<Integer> st){
      visited[node] = true;
      path[node] = true;

      for(int ngh:adj.get(node)){
        if(!visited[ngh]){
          if(dfs(ngh, adj, visited, path, st)) return true;
        }else if(path[ngh]) return true;
      }
      path[node] = false;
      st.push(node);
      return false;
    }

    public int[] findOrder(int C, int[][] prerequisites) {
        if(C==1) return new int[]{0};
        boolean []visited = new boolean[C];
        boolean []path = new boolean[C];
        Stack<Integer> st = new Stack<>();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<C;i++) adj.add(new ArrayList<>());
        for(int []ed:prerequisites){
          adj.get(ed[1]).add(ed[0]);
        }

        for(int i=0;i<C;i++){
          if(!visited[i]){
            if(dfs(i, adj, visited, path, st)) return new int[0];
          }
        }

        int []ans = new int[st.size()];
        int i = 0;
        while(!st.isEmpty()){
          ans[i++] = st.pop(); 
        }

        return ans;
    }
}