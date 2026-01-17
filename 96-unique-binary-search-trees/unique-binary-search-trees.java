class Solution {
    static int []dp;
    public static int solve(int n){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        int count = 0;
        for(int i=1;i<=n;i++){
          count += solve(i-1)*solve(n-i);
        }

        return dp[n]= count;
    }
    public int numTrees(int n) {
        // if(dp[n]!=0) return dp[n];
        dp = new int[n+1];
        Arrays.fill(dp,0);
        dp[0] = 1;

        

        return solve(n);
    }
}