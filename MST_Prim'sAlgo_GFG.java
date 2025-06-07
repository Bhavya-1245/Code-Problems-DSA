// User function Template for Java

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int sum=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        
        boolean []visited = new boolean[V];
        pq.add(new int[]{0,0}); // (weight, vertex)
        
        
       while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int wt = curr[0];
            int u = curr[1];

            if (visited[u]) continue;

            // Mark the node visited and add weight
            visited[u] = true;
            sum += wt;

            // Traverse all adjacent nodes
            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                int edgeWeight = neighbor[1];
                if (!visited[v]) {
                    pq.add(new int[]{edgeWeight, v});
                }
            }
        }

        return sum;
    }
}
