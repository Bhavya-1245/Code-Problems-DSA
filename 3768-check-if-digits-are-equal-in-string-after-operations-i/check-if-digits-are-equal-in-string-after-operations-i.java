class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length()==1 || s.length()==0) return false;

        ArrayList<Integer> digits = new ArrayList<>();

        for(char c: s.toCharArray()){
          digits.add(Character.getNumericValue(c));
        }

        while(digits.size()>2){
          ArrayList<Integer> arr = new ArrayList<>();

          for(int i=0;i<digits.size()-1;i++){
            int n1 = digits.get(i);
            int n2 = digits.get(i+1);
            int res = (n1+n2)%10;
            arr.add(res);
          }

          digits = arr;
        }

        return digits.get(0).equals(digits.get(1));
    }
}