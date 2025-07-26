class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        for(int i=0;i<s.length();i++){
            int val = roman.get(s.charAt(i));

            if(i<s.length()-1 && val<roman.get(s.charAt(i+1))){
                sum-=val;
            }else{
                sum+=val;
            }
        }
        return sum;
    }
}