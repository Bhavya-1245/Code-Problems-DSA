class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;

        for(int i:nums){
          if(i==1) currentCount++;
          else currentCount = 0;

          maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}