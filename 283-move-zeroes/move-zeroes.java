class Solution {
    public void moveZeroes(int[] nums) {
        int inPos = 0;

        for(int num: nums){
            if(num!=0) nums[inPos++] = num;
        }
        while(inPos<nums.length){
            nums[inPos++] = 0;
        }
        
    }
}