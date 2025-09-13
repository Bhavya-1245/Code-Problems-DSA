class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;

        int n = nums.length;

        for(int i=0;i<n-1;i++){
            int j = i+1;
            while(j<n){
                if((nums[i]==nums[j]) && (i*j)%k==0) count++;
                j++;
            }
        }

        return count;
    }
}