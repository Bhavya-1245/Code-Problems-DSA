class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int ans=-1, start = 1, end = x, mid;

        while(start<=end){
            mid = start + (end-start)/2;

            if(mid == x/mid) {
                ans = mid;
                break;
            }
            else if(mid<x/mid){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}