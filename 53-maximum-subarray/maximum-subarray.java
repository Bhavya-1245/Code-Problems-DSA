class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int prefix = nums[0];
        for(int i=1;i<nums.length;i++){
          prefix = Math.max(nums[i], prefix+nums[i]);
          max = Math.max(max, prefix);
        }
        return max;
    }
}