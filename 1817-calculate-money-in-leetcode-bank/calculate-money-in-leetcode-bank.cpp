class Solution {
public:
    int totalMoney(int n) {
        int ans = 0;
        int d=1;
        int fixed = 1;
        int coins = 1;

        while(d<=n){
          ans += coins;
          coins++;
          if(d%7==0){
            coins = fixed + 1;
            fixed++;
          }
          d++;
        }

        return ans;
    }
};