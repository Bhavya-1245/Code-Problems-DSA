class Solution {
    public long splitArray(int[] nums) {
        //long ans = Long.MIN_VALUE;
        int n = nums.length;
        
        long []prefix = new long[n];
        long []suffix = new long[n];

        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        
        for(int i=1; i<n-1; i++){
            if(nums[i]>nums[i-1] && prefix[i-1] != -1){
                prefix[i] = prefix[i-1] + nums[i];
            }
            else{
                prefix[i] = -1;
            }
            
        }

        for(int j=n-2; j>0; j--){
            if(nums[j]>nums[j+1] && suffix[j+1] != -1){
                suffix[j] = suffix[j+1] + nums[j];
            }
            else{
                suffix[j] = -1;
            }
            
        }

        int i = 0, j = 1;
        long ans = Long.MAX_VALUE;
        while(i<n-1 && j<n){
            long left = prefix[i];
            long right = suffix[j];
            if(left!=-1 && right!=-1){
                ans = Math.min(ans, Math.abs(left-right));
            }
            i++;
            j++;
        }

        return (ans != Long.MAX_VALUE) ? ans:-1;

    }

    
}