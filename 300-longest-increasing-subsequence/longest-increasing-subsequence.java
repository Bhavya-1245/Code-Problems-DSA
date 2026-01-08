class Solution {
    static int n;
    static int [][]dp;

    public static int solve(int []nums, int i, int idx){
      if(i>=n) return 0;
      if(dp[i][idx+1]!=Integer.MIN_VALUE ) return dp[i][idx+1];
      int take = Integer.MIN_VALUE;

      if(idx == -1 || nums[idx] < nums[i]) take = 1 + solve(nums, i+1, i);

      int skip = solve(nums, i+1, idx);

      return dp[i][idx + 1] = Math.max(take, skip);
    }
    public int lengthOfLIS(int[] nums) {
        n = nums.length;

        dp = new int[n][n+1];

        for(int []row: dp) Arrays.fill(row, Integer.MIN_VALUE);

        
        return solve(nums, 0, -1);
    }


}