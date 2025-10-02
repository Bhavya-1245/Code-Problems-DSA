class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        triangularSum(nums, n);
        return nums[0];
    }

    public static void triangularSum(int []nums,int n){
        if(n==1) return;

        for(int i=1; i<n;i++){
            nums[i-1] = (nums[i-1] + nums[i])%10;
        }

        triangularSum(nums, n-1);
        return;
    }
}