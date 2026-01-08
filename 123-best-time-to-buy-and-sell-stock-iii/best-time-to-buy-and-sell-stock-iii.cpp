class Solution {
public:
    int n;
vector<vector<vector<int>>> dp;
    int solve(vector<int>& prices, int i, bool flag, int cap){
        if(i>=n || cap==0)  return 0;

        if(dp[i][flag][cap]!=-1)    return dp[i][flag][cap];
        if(flag){
            int buy= -prices[i] + solve(prices, i+1, 0, cap);
            int not_buy= solve(prices, i+1, 1, cap);
            return dp[i][flag][cap]=max(buy, not_buy);
        }
        int sell= prices[i]+ solve(prices, i+1, 1, cap-1);
        int not_sell= solve(prices, i+1, 0, cap);
        return dp[i][flag][cap]=max(sell, not_sell);
    }

    int maxProfit(vector<int>& prices) {
        n= prices.size();
        dp.assign(n, vector<vector<int>>(2, vector<int>(3,-1)));
        return solve(prices, 0, 1, 2);
    }
};