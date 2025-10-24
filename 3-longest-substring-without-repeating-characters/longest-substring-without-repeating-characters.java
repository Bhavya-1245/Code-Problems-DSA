class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1) return s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int size = 0;
        for(int i=1;i<s.length();i++){
          char c = s.charAt(i);
          if(sb.indexOf(String.valueOf(c))==-1){
            sb.append(c);
          }else{
            sb.delete(0, sb.indexOf(String.valueOf(c))+1);
            sb.append(c);
          }
          size = Math.max(size, sb.length());
        }

        return size;
    }
}