class Solution {
    public boolean isPalindrome(String s) {
        if(s=="" || s.length()==1) return true;
       String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

       int i = 0;
       int j = str.length()-1;

       while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
       } 

       return true;
    }
}