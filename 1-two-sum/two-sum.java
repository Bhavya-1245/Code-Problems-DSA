class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            for(;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}