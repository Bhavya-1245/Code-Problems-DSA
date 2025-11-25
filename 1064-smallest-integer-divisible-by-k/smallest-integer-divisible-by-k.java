class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k==1) return 1;
        int bin = 1;

        int i = 1;
        while(i<=k){
          int rem = bin%k;
          if(rem==0) return i;
          bin = rem*10 + 1;
          i++;
        }

        return -1;
    }
}