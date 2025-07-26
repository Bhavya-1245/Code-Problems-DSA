class Solution {
    public String convertToBase7(int num) {
        if(num<7&&num>-1) return String.valueOf(num);

        int n = Math.abs(num);
        StringBuilder s = new StringBuilder();
        while(n>6){
            int r = n%7;
            s.append(String.valueOf(r));
            n/=7;
        }
        if(n!=0){
            s.append(String.valueOf(n));
        }
        if(num<0){
            s.append("-");
        }
        return s.reverse().toString();
    }
}