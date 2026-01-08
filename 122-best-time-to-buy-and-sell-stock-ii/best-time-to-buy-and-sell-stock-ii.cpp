class Solution {
public:
    int n;
int t[30001][2];
    int solve(vector<int>& prices, int i, bool flag){
        if(i>=n)    return 0;
        if(t[i][flag]!=-1)  return t[i][flag];
        if(flag){
            int buy= -prices[i]+solve(prices, i+1,0);
            int not_buy= solve(prices, i+1,1);
            return t[i][flag]=max(buy, not_buy);
        }
        int sell= prices[i]+solve(prices, i+1,1);
        int not_sell= solve(prices, i+1,0);
        return t[i][flag]=max(sell, not_sell);
    }

    int maxProfit(vector<int>& prices) {
        n=prices.size();
        memset(t,-1,sizeof(t));
        return solve(prices, 0,1);
    }
};