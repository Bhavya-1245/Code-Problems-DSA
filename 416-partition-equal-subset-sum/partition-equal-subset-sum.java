class Solution {
  static int [][]dp;

    static int helper(int []arr, int i, int sum){
      if(sum == 0) return 1;
      if(i==arr.length){
        if(sum == 0) return 1;
        return 0;
      }

      if(sum<0) return 0;
      if(dp[i][sum]!=-1) return dp[i][sum];

      int skip = helper(arr, i+1, sum);
      int take = helper(arr, i+1, sum - arr[i]);

      return dp[i][sum] = (take>0 || skip>0) ? 1 : 0;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums) sum += i;

        if(sum % 2 == 1) return false;

        dp = new int[nums.length][sum/2 + 1];
        for(int []row: dp) Arrays.fill(row, -1);

        return helper(nums, 0, sum/2) == 1;
     }
}