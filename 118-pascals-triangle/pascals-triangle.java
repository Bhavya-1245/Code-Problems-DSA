class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            int []dp = new int[i];
            Arrays.fill(dp,0);

            pascal(i, dp, arr, i-1, 0);
        }

        return arr;
    }

    public static void pascal(int n, int[] dp, List<List<Integer>> arr, int i, int j){
        if(j == n){
            
            List<Integer> a =new ArrayList<>();
            for(int m:dp) a.add(m);
            arr.add(a);
            return;
        } 

        if(j == 0 || j == n-1){
            dp[j] = 1;
        }else{
            dp[j]= arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
        }
        pascal(n, dp, arr, i, j+1);
    }
}