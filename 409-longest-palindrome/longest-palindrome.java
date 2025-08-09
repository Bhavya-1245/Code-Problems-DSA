class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int size = 0;
        int odd = 0;

        for(Map.Entry<Character, Integer> em: map.entrySet()){
            if(em.getValue()%2==0){
                size += em.getValue();
            }else{
                size += em.getValue()-1;
                odd = 1;
            }
        }

        size = (odd==1) ? size+1 : size;

        return size;
    }
}