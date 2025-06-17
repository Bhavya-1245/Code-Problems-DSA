class Solution {
    public int climbStairs(int n) {
        if(n<=1) return n;
        
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);

        return steps(n,dp);
        
    }

    public static int steps(int n, int []dp){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=steps(n-1,dp)+steps(n-2,dp);
        
    }
}