class Solution {
    public static int gcd(int a, int b) {
        // code here
        return b%a==0 ? a : gcd(b%a,a);
    }
}
