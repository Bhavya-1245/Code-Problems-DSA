class Solution {
    // Bhavya
    public int[] getOrder(int[][] tasks) {
        
        int n = tasks.length;
        List<Integer> result = new ArrayList<>();

        // Step 1: Attach original index to each task
        int[][] indexedTasks = new int[n][3];
        for (int i = 0; i < n; i++) {
            indexedTasks[i][0] = tasks[i][0]; // enqueue time
            indexedTasks[i][1] = tasks[i][1]; // processing time
            indexedTasks[i][2] = i;           // original index
        }

        // Step 2: Sort tasks based on enqueue time
        Arrays.sort(indexedTasks, Comparator.comparingInt(a -> a[0]));

        // Step 3: PriorityQueue to select task with shortest processing time (tie -> smaller index)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
            a[0] != b[0] ? Integer.compare(a[0], b[0])
                         : Integer.compare(a[1], b[1])
        );

        int time = 0, i = 0;
        while (i < n || !pq.isEmpty()) {
            // If queue is empty, jump to next available task time
            if (pq.isEmpty() && time < indexedTasks[i][0]) {
                time = indexedTasks[i][0];
            }

            // Enqueue tasks that are ready
            while (i < n && indexedTasks[i][0] <= time) {
                pq.offer(new int[]{indexedTasks[i][1], indexedTasks[i][2]}); // {processing, index}
                i++;
            }

            // Process next task
            if (!pq.isEmpty()) {
                int[] current = pq.poll();
                time += current[0];
                result.add(current[1]);
            }
        }

        // Convert result list to array
        int[] res = new int[n];
        for (int j = 0; j < n; j++) res[j] = result.get(j);
        return res;

    }

    
}