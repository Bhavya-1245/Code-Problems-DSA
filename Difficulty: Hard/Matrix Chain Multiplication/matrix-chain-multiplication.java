class Solution {
    static int [][]dp;
    static int solve(int []arr, int i, int j){
        if(i>=j) return 0;
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j]; 
        int min = Integer.MAX_VALUE;
        
        for(int k = i; k<j;k++){
            int temp = solve(arr, i, k) + solve(arr, k+1, j) + arr[i-1] * arr[k] * arr[j];
            min = Math.min(min, temp);
        }
        
        return dp[i][j] = Math.min(dp[i][j], min);
    }
    
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        dp = new int[n][n];
        
        for(int []row: dp) Arrays.fill(row, Integer.MAX_VALUE);
        
        return solve(arr, 1, n-1);
    }
}