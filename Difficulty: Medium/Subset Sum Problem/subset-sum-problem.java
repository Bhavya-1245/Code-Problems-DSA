class Solution {
    
     static boolean [][]dp;
    
    // static int helper(int []arr, int i, int sum){
    //     if(sum == 0) return 1;
        
    //     if(i == arr.length){
    //         if(sum==0) return 1;
    //         return 0;
    //     }
        
    //     if(sum<0) return 0;
        
    //     if(dp[i][sum]!=-1) return dp[i][sum];
        
    //     int pick = helper(arr, i+1, sum - arr[i]);
        
    //     int skip = helper(arr, i+1, sum);
        
    //     return dp[i][sum] = (pick> 0 || skip > 0) ? 1 : 0;
    // }
    
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        dp = new boolean[arr.length+1][sum+1];
        int n = arr.length;
        for(int i = 0; i<=n; i++){
            dp[i][0] = true;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        // do[0] = sum; 
        return dp[n][sum];
    }
}