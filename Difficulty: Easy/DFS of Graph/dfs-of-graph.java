class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean []visited = new boolean[adj.size()];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(adj, 0, visited, ans);
        
        return ans;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int val, boolean []visited, ArrayList<Integer> ans){
        visited[val] = true;
        ans.add(val);
        
        for(int i:adj.get(val)){
            if(visited[i]!=true){
                dfs(adj, i, visited, ans);
            }
        }
    }
}