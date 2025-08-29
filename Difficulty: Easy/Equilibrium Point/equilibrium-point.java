class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int total_sum = 0;
        for(int i:arr) total_sum+=i;
        
        int leftsum=0;
        
        for(int i=0;i<n;i++){
            int rightsum = total_sum - leftsum - arr[i];
            
            if(leftsum==rightsum) return i;
            
            leftsum += arr[i];
        }
        
        return -1;
        
    }
}
