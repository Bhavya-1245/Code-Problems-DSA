class Solution {
    
     static int [][]dp;
    
    static int helper(int []arr, int i, int sum){
        if(sum == 0) return 1;
        if(i == arr.length){
            if(sum==0) return 1;
            return 0;
        }
        if(sum<0) return 0;
        if(dp[i][sum]!=-1) return dp[i][sum];
        int pick = helper(arr, i+1, sum - arr[i]);
        int skip = helper(arr, i+1, sum);
        return dp[i][sum] = (pick> 0 || skip > 0) ? 1 : 0;
    }
    
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        dp = new int[arr.length][sum+1];
        
        for(int []row: dp) Arrays.fill(row, -1);
        
        // do[0] = sum; 
        return helper(arr,0, sum) == 1;
    }
}