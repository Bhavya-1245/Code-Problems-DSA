class Solution {

    public static int solve(int n){
      int sum = 0;
      while(n>0){
        sum += (int)Math.pow(n%10, 2);
        n /= 10;
      }

      return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hn = new HashSet<>();

        while(true){
          n = solve(n);
          if(n==1) return true;
          if(hn.contains(n)) return false;
          hn.add(n);
        }

    }
}