class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()|| (s.length()>0 && t.length()==0)) return false;
        if(s.length()==0) return true;
        int i=0;
        for(int j=0; j<t.length();j++){
            char x = s.charAt(i);
            char y = t.charAt(j);
            if(x==y) i++;
            if(i==s.length()) return true;
        }

        return (i==s.length())?true:false;
    }
}