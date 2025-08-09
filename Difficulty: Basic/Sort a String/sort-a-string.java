// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        int []alpha = new int[26];
        Arrays.fill(alpha, 0);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            int index  = c - 'a';
            alpha[index]++;
        }
        
        for(int i=0;i<26; i++){
            int a = alpha[i];
            while(a>0){
                str.append((char)('a'+i));
                a--;
            }
        }
        
        return str.toString();
    }
}