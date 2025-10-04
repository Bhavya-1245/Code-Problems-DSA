class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while(i<j){
          int b = j-i;
          int l = Math.min(height[i], height[j]);
          max = Math.max(max, l*b);
          if(height[i]>height[j]) j--;
          else i++;
        }

        return max;
    }
}