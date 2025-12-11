class Solution {

    public static int minimumSum(List<List<Integer>> triangle, int i, int j, int n, int [][]dp){
      if(i==n-1){
        return triangle.get(i).get(j);
      }

      if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];

      int sum1 = minimumSum(triangle, i+1, j, n, dp);
      int sum2 = minimumSum(triangle, i+1, j+1, n, dp);

      return dp[i][j] = triangle.get(i).get(j) + Math.min(sum1, sum2);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][]dp = new int[n][n];
        
        for(int i=0; i<n;i++){
          dp[0][i] = triangle.get(n-1).get(i);
        }
        
        for(int i=1;i<n; i++){
          for(int j=0; j<n-i; j++){
            dp[i][j] = triangle.get(n-i-1).get(j) + Math.min(dp[i-1][j], dp[i-1][j+1]);
            
          }
        }

        return dp[n-1][0];
        
    }

}