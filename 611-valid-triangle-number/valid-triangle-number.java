class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int k = nums.length-1;

        while(k>=2){
            int i = 0;
            int j = k-1;

            while(i<j && i<nums.length-2 && j>=1){
                if(nums[i]+nums[j]>nums[k]){
                    count+= (j-i);
                    j--;
                }else{
                    i++;
                }
            }
            k--;
        }

        return count;
    }
}