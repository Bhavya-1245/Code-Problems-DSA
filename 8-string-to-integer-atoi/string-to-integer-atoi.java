class Solution {
    public int myAtoi(String s) {
        
        int n = s.length();
        int sign = 1;
        int c = 0;
        long res = 0;
        int i=0;
        while(i<n && s.charAt(i)==' '){
          i++;
        }
        while(i<n && (s.charAt(i)=='-'||s.charAt(i)=='+')){
          sign = (s.charAt(i)=='-') ? -1:1;
          c++;
          i++;
          if(c>1) return 0;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
          res = res*10 + (s.charAt(i)-'0');
          if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
          if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
          i++;
        }

        return (int) res*sign;
    }
}