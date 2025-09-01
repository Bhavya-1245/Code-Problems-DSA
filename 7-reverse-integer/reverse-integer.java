class Solution {
    public int reverse(int x) {
        
        long ans = 0;
        long num = Math.abs(x);

        while(num>0){
            ans= ans*10 + num%10;
            num/=10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
        return (x<0) ? -(int)ans:(int)ans;
    }
}