class Solution {
  static int n;
  static int []dp;

  static int solve(int []nums, int i){
    if(i==0) return nums[i];
    if(dp[i]!=-1) return dp[i];

    return dp[i] = Math.max(nums[i], nums[i]+solve(nums,i-1));
  }
    public int maxSubArray(int[] nums) {
        n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = nums[0];
        for(int i=1;i<n;i++) ans = Math.max(ans,solve(nums, i));
        
        
        return ans;

    }
}