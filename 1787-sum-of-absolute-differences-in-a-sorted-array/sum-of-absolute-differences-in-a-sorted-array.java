class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int []res = new int[nums.length];
        int []prefix = new int[nums.length];
        int n = nums.length;
        prefix[0] = nums[0];
        for(int i = 1; i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0;i<n;i++){
            int leftSum = prefix[i] - nums[i];
            int rightSum = prefix[n-1] - prefix[i];

            int leftCount = i;
            int rightCount = n-1-i;

            res[i] = (nums[i]*leftCount - leftSum) + (rightSum - rightCount*nums[i]);
        }

        return res;
    }

    
}