class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i: nums){
          sum += i;
        }
        int sum1 = 0;
        for(int i=0;i<nums.length-1;i++){
          
          sum1+=nums[i];
          int diff = (sum-sum1) - sum1;
          if(diff%2==0) count++;
        }

        return count;
    }
}