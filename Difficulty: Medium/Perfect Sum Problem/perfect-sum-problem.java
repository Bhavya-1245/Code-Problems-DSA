class Solution {
    // Function to calculate the number of subsets with a given sum
    static int size;
    static int [][]dp;
    static int helper(int []nums, int i, int target){
        if(i>=size && target==0 ) return 1;
        if(i>=size && target!=0 ) return 0;
        if(dp[i][target]!=-1) return dp[i][target];
        // if(target == 0) return 1;
        int pick = 0;
        if(nums[i]<=target){
            
        pick = helper(nums, i+1, target - nums[i]);
        }
        int skip = helper(nums, i+1, target);
        
        return dp[i][target] = pick+skip;
    }
    public int perfectSum(int[] nums, int target) {
        // code here
        // if(target == 0) return 1;
        
        size = nums.length;
        dp = new int[size][target+1];
        for(int []row: dp) Arrays.fill(row, -1);
        // tar = target;
        int count = helper(nums, 0,target);
        
        return count;
    }
}