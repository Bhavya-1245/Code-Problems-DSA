class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
          if(s.charAt(left)!=s.charAt(right)){

            boolean case1 = isPalindrome(s, left+1, right);
            boolean case2 = isPalindrome(s, left, right-1);

            return case1 || case2;
          }
          left++;
          right--;
        }

        return true;
    }

    public static boolean isPalindrome(String s, int i, int j){
      while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}