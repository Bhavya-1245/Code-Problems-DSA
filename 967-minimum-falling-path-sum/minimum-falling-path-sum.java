class Solution {
  public static int minimumSum(int [][]matrix, int i, int j, int n, int [][]dp){
        if(i==0){
          return matrix[i][j];
        }
        // if(i>=n) return Integer.MAX_VALUE; 
        if(dp[i][j]!=-101) return dp[i][j];

        int sum = 0;

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int mid = matrix[i][j] + minimumSum(matrix, i-1, j, n, dp);
        if(j>0) left = matrix[i][j] + minimumSum(matrix, i-1, j-1, n, dp);
        if(j<n-1) right = matrix[i][j] + minimumSum(matrix, i-1, j+1, n, dp);
        sum = Math.min(left, Math.min(mid, right));
        return dp[i][j] = sum;
        
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        // int m = matrix[0].length;
        int dp[][] = new int[n][n];
        for(int []row: dp) Arrays.fill(row, -101);
        int sum = Integer.MAX_VALUE;
        int i = 0;
        for(int j=0; j<n; j++){
          sum = Math.min(sum,minimumSum(matrix, n-1, j, n, dp));
        }
        return sum;
    }

}