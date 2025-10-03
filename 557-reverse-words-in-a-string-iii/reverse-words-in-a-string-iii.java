class Solution {
    public String reverseWords(String s) {
        
        
        String []words = s.split(" ");
        int n = words.length;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++){
          String s1 = words[i];

          String word = new StringBuilder(s1).reverse().toString();

          result.append(word);

          if(i<n-1){
            result.append(" ");
          }
        }

        return result.toString();
    }
}