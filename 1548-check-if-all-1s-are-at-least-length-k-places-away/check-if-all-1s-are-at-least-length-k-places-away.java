class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(k<0 || nums.length<k|| nums.length==0 ) return false;

        int i=0, n = nums.length, lastIndex = -1;

        while(i<n){
          if(nums[i]==1){
            if(lastIndex!=-1){
              if((i-lastIndex-1)<k) return false;
            }
            lastIndex = i;
          }
          i++;
        }

        return true;

    }
}