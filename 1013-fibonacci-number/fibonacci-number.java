class Solution {
    public int fib(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);

        return fibo(n,dp);
    }
    public static int fibo(int n, int[] dp){
        //  base condition
        if(n<=1) return n;
        // already calculated;
        if(dp[n]!=-1) return dp[n];

        return dp[n]=fibo(n-1, dp) + fibo(n-2, dp);
    }
}