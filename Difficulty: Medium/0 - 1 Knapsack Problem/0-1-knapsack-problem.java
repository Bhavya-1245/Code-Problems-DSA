class Solution {
    static long wgt = 0;
    static int n = 0;
    static long [][]dp;
    public static long solve(int []wt, int val[], int idx, long sum){
        if(idx >= n) return 0;
        if(dp[idx][(int) sum]!=-1) return dp[idx][(int)sum];
        long skip = solve(wt, val, idx + 1, sum);
        long take = 0;

        if(wt[idx] + sum <= wgt){
            take = solve(wt, val, idx+1, sum + wt[idx]) + val[idx];
        }

        return dp[idx][(int)sum] = Math.max(skip, take);
    }
    public static int knapsack(int W, int []val, int wt[]){
        wgt = W;
        n = wt.length;
        dp = new long[n+1][W+1];
        for(long []row: dp) Arrays.fill(row, -1);
        return (int) solve(wt, val, 0, 0);
    }
}
