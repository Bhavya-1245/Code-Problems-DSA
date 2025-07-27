class Solution {
    public boolean wordPattern(String pattern, String s) {
        char []ch = pattern.toCharArray();
        String []str = s.split(" ");

        if(ch.length!= str.length) return false;

        HashMap<Character, String> map1 =new HashMap<>();
        HashMap<String,Character> map2 =new HashMap<>();

        for(int i=0;i<ch.length;i++){
            char c1 = ch[i];
            String s1 = str[i];

            if(!map1.containsKey(c1)) map1.put(c1,s1);
            else{
                if(!map1.get(c1).equals(s1)) return false;
            }
            if(!map2.containsKey(s1)) map2.put(s1,c1);
            else{
                if(map2.get(s1)!=c1) return false;
            }

        }
        return true;
    }
}