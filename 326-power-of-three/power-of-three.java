class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<3 && n!=1) return false;
        
        int c=0;
        while(n%3==0) {
            c++;
            n/=3;
        }

        return n==1;
    }
}