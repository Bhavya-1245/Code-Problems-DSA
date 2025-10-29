class Solution {
    public int smallestNumber(int n) {
        int num = Integer.highestOneBit(n);
        return (num*2) - 1;
    } 
}