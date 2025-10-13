class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if(n==Integer.MIN_VALUE) return 1/( x * myPow(x, Integer.MAX_VALUE));
        if(n<0) {
          x = 1/x;
          n = Math.abs(n);
        }
        
        double halfPower = myPow(x, n/2);
        halfPower = halfPower * halfPower;

        if(n%2==1){
          halfPower = x * halfPower;
        }

        return halfPower;
    }
}