class Solution {
    // for '(' -> +1
    // for ')' -> -1
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='(') {
            counter++;
            if(counter>1) sb.append(s.charAt(i));
          }
          if(s.charAt(i)==')') {
            counter--;
            if(counter>0) sb.append(s.charAt(i));
          }
          
        }

        return sb.toString();
    }
}