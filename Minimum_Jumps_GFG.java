class Solution {
    static int minJumps(int[] arr) {
        // code here
       int n = arr.length;

        // Edge case: If the array has only one element
        if (n == 1) {
            return 0; // No jumps needed
        }

        // If the first element is 0, we cannot move forward
        if (arr[0] == 0) {
            return -1;
        }

        // Initialize variables
        int jumps = 0;        // Number of jumps
        int currentEnd = 0;   // Current range end
        int farthest = 0;     // Farthest we can go

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest position we can reach
            farthest = Math.max(farthest, i + arr[i]);

            // If we reach the end of the current range
            if (i == currentEnd) {
                jumps++;           // Increment jump count
                currentEnd = farthest; // Update the current end

                // If the farthest position is beyond the last index
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }

        // If we exit the loop without reaching the last index
        return -1;
    }
}
