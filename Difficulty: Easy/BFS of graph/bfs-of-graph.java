class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean []visited = new boolean[adj.size()];
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        
        visited[0] = true;
        
        while(!q.isEmpty()){
            int val = q.peek();
            q.poll();
            ans.add(val);
            
            for(int i: adj.get(val)){
                if(visited[i]!=true){
                    visited[i] = true;
                    q.add(i);
                }
            }
            
        }
        
        return ans;
    }
}