class Solution {
    static int [][]dp;
    // stock - 0 - buy
    // stock - 1 - sell
    // stock - 2 - cooldown;

    public static int max_profit(int []price, int i, int n, int stock){
      
        if(i == n - 1){
          if(stock == 0|| stock == 2){
            return 0;
          }
          else{
            return price[i];
          }
        }
        if(dp[i][stock]!=-1) return dp[i][stock];
        int result = max_profit(price, i+ 1, n, stock == 2? 0 : stock);
        if(stock== 0){
          result = Math.max(result, -price[i] + max_profit(price, i + 1, n, 1));
        }
        else if(stock == 1){
          result = Math.max(result, price[i] + max_profit(price, i + 1, n, 2));

        }
        return dp[i][stock] = result;
    } 
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;

        int n = prices.length;
        dp = new int[n][3];
        for(int []row: dp) Arrays.fill(row,-1);
        return max_profit(prices, 0, n, 0);
    }
}