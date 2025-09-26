class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int ans[] = new int[n+n];
        int j = 0 ;
        for(int i:nums) ans[j++] = i;
        for(int i:nums) ans[j++] = i;

        return ans;
    }
}