class Solution {
    public int findClosest(int x, int y, int z) {
        int first = Math.abs(x-z);
        int second = Math.abs(y-z);

        

        return (first>second) ? 2:((first<second) ? 1:0);
    }
}