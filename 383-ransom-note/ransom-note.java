class Solution {
    public boolean canConstruct(String r, String m) {
        int []rch = new int[26];
        int []mch = new int[26];
        int r1 = r.length(), m1 = m.length();
        for(int i=0;i<r1;i++){
          char x = r.charAt(i);
          rch[x-'a']++;
        }
        for(int i=0;i<m1;i++){
          char x = m.charAt(i);
          mch[x-'a']++;
        }
        int count = 0;
        for(int i=0;i<r1;i++){
          char x = r.charAt(i);
          if(rch[x-'a']<=mch[x-'a']) count++;
        }

        return count==r1 ? true : false;
    }
}