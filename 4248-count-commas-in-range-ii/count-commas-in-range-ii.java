class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long val = 1000;

        while(val<=n){
          ans += n - val + 1;
          val *= 1000;
        }

        return ans;
    }
}