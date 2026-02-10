class Solution {
    
    public static boolean dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
    boolean[] path, Stack<Integer> st){
        visited[src] = true;
        path[src] = true;
        
        for(int ngh: adj.get(src)){
            if(!visited[ngh]){
                if(dfs(ngh, adj, visited, path, st)) return true;
            }
            else if(path[ngh]) return true;
        }
        
        path[src] = false;
        st.push(src);
        return false;
    }
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V; i++){
            adj.add(new ArrayList<>());
            
        }
        
        for(int []ed : edges){
            adj.get(ed[0]).add(ed[1]);
            // adj.get(ed[1]).add(ed[1]);
        }
        boolean visited[] = new boolean[V];
        boolean path[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i, adj, visited, path, st)) return new ArrayList<>();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        
        return ans;
        
    }
}