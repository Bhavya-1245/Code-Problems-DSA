class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            if(nums[i]==val){
                if(nums[j]==val) nums[j--] = -1;
                else{
                    nums[i++] = nums[j];
                    nums[j--] = -1;
                }
            }
            else{
                i++;
            }
        }
        int count = 0;
        for(int e:nums){
            if(e!=-1){
                count++;
            }
        }
        return count;
    }
}