class Solution {
public:
    int n;
vector<vector<vector<int>>> dp;
    int solve(vector<int>& prices, int i, int flag, int k){
        if(i>=n || k==0)    return 0;
        if(dp[i][flag][k]!=-1)  return dp[i][flag][k];
        if(flag){
            int buy= -prices[i]+solve(prices, i+1, 0, k);
            int not_buy= solve(prices, i+1, 1,k);
            return dp[i][flag][k]=max(buy,not_buy);
        }
        int sell= prices[i]+ solve(prices, i+1, 1, k-1);
        int not_sell= solve(prices, i+1, 0,k);
        return dp[i][flag][k]=max(sell, not_sell);
    }

    int maxProfit(int k, vector<int>& prices) {
        n= prices.size();
        dp.assign(n, vector<vector<int>>(2, vector<int>(k+1,-1)));
        return solve(prices, 0, 1, k);
    }
};