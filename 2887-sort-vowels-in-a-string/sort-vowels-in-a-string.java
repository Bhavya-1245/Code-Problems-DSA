class Solution {
    public String sortVowels(String s) {
        int []up = new int[26];
        int []lo = new int[26];

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for(int i=0; i<s.length();i++){
          char x = s.charAt(i);
          if(x=='a'|| x == 'e' || x=='i' || x=='o' || x=='u'){
            lo[x-'a']++;
            sb1.append('#');
          }
          else if(x=='A'|| x == 'E' || x=='I' || x=='O' || x=='U'){
            up[x-'A']++;
            sb1.append('#');
          }else{
            sb1.append(x);
          }
        }

        for(int i=0; i<26; i++){
          char x = (char)(i + 'A');

          if(x =='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            while(up[i]>0){
              sb.append(x);
              up[i]--;
            }
          }
        }

        for(int i=0; i<26; i++){
          char x = (char)(i + 'a');

          if(x =='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            while(lo[i]>0){
              sb.append(x);
              lo[i]--;
            }
          }
        }
        
        int sec = 0, first = 0;
        while(first<sb1.length()){
          if(sb1.charAt(first)=='#'){
            sb1.replace(first, first+1, String.valueOf(sb.charAt(sec)));
            sec++;
          }
          first++;
        }

        return sb1.toString();
    }
}