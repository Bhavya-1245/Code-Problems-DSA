class Solution {
    public int climbStairs(int n) {
        if(n<=1) return n;
        
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);

        return steps(n,0,dp);
        
    }

    public static int steps(int n, int i, int []dp){
        if(i>n) return 0;
        if(i==n) return 1;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=steps(n,i+1,dp)+steps(n,i+2,dp);
        
    }
}