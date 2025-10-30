class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        char res='\0';
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){
          char x = s.charAt(i);
          mapS.put(x, mapS.getOrDefault(x,0)+1);
        }

        for(int i=0;i<t.length();i++){
          char x = t.charAt(i);
          mapT.put(x, mapT.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Character,Integer> e: mapT.entrySet()){
          int valT = e.getValue();

          int valS = (mapS.containsKey(e.getKey()))?mapS.get(e.getKey()):0;

          if(valS!=valT){
            res = e.getKey();
            break;
          }
        }
        return res;
    }
}