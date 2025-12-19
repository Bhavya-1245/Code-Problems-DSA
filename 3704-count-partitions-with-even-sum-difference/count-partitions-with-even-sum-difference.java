class Solution {
    public int countPartitions(int[] nums) {
        int prefixSum = Arrays.stream(nums).sum();
        return prefixSum % 2 == 0 ? nums.length-1: 0;
    }
}