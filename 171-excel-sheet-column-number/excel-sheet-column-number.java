class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=0; i<columnTitle.length();i++){
          char x = columnTitle.charAt(i);

          int val = x - 'A' + 1;

          result = result*26 + val;
        }

        return result;
    }
}