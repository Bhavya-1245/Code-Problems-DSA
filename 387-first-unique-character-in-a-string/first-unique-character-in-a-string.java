class Solution {
    public int firstUniqChar(String s) {
        int []ch = new int[26];

        for(int i=0; i<s.length(); i++){
          char x = s.charAt(i);
          ch[x-'a']++;
        }

        for(int i=0;i<s.length();i++){
          char x = s.charAt(i);
          if(ch[x-'a']==1) return i;
        }

        return -1;
    }
}