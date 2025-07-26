class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=0) return false;

        int sq = (int)Math.sqrt(num);

        return sq*sq==num;
    }
}