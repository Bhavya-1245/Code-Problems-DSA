class Solution {
    public int maxFreqSum(String s) {
        int vow_count = 0, cons_count = 0;

        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);

            if(x == 'A' || x == 'a' || x == 'E' || x == 'e' || x == 'I' || x == 'i' || x == 'O' || x == 'o' || x == 'U' || x == 'u'){
                vowel.put(x, vowel.getOrDefault(x,0)+1);
            }
            else{
                consonant.put(x, consonant.getOrDefault(x,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> e: vowel.entrySet()){
            if(e.getValue()>vow_count) vow_count = e.getValue();
        }

        for(Map.Entry<Character,Integer> e: consonant.entrySet()){
            if(e.getValue()>cons_count) cons_count = e.getValue();
        }

        return vow_count + cons_count;
    }
}