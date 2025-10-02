class Solution {
    public int arrangeCoins(int n) {
        long completeRows = 0;
        long start = 1;
        long end = n;

        while(start<=end){
          long mid = start + (end - start)/2;

          long req = mid * (mid+1) / 2;

          if(req<=n){
            completeRows = mid;
            start = mid + 1;
          }else{
            end = mid - 1;
          }
        }

        return (int)completeRows;
    }
}