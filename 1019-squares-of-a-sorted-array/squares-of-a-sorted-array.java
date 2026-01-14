class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(;i<n;i++){
          nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}