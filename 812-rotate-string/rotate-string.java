class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int c = 0;
        StringBuilder sb = new StringBuilder(s);
        while(c!=n){
          char ch = sb.charAt(0);
          int j=1;
          while(j<n){
            sb.setCharAt(j-1, sb.charAt(j));
            j++;
          }
          sb.setCharAt(j-1, ch);
          if(sb.toString().equals(goal)) return true;
          c++;
        }
        return false;
    }
}