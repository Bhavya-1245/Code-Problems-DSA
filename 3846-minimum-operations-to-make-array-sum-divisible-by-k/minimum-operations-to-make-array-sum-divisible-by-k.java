class Solution {
    public int minOperations(int[] nums, int k) {
        if(k==0) return 0;

        int sum = 0;

        for(int num: nums) sum += num;

        if(sum < k) return sum;
        if(sum % k == 0) return 0;
        int opr = 0;
        while(sum % k != 0){
          opr++;
          sum--;
        }

        return opr;
    }
}