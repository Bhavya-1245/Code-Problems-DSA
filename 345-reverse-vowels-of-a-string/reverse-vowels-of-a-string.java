class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        String vowels = "AaEeIiOoUu";
        char []ch = s.toCharArray();
        while(i<j){
            if(vowels.indexOf(s.charAt(i))!=-1 && vowels.indexOf(s.charAt(j))!=-1){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if(vowels.indexOf(s.charAt(i))==-1 && vowels.indexOf(s.charAt(j))==-1){
                i++; j--;
            }
            else if(vowels.indexOf(s.charAt(i))==-1){
                i++;
            }
            else if(vowels.indexOf(s.charAt(j))==-1){
                j--;
            } 
        }
        String s1 = new String(ch);

        return s1;
    }
}