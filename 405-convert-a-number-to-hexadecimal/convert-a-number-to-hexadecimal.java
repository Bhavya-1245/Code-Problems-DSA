class Solution {
    public String toHex(int num) {
        
        if(num==0) return "0";
        int n=num;
        StringBuilder s=new StringBuilder();
        char []hex = "0123456789abcdef".toCharArray();
        while(n!=0 && s.length()<=8 ){
            int r = n & 15;
            s.append(hex[r]);
            n = n>>>4;
        }

        return s.reverse().toString();
    }
}