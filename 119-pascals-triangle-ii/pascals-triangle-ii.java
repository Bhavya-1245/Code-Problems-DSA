class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> arr = new ArrayList<>();

        for(int i=1;i<=rowIndex+1;i++){
            int []dp = new int[i];
            pascal(i, dp, arr, i-1, 0);
        }

        return arr.get(rowIndex);
    }

    public static void pascal(int n, int[] dp, List<List<Integer>> arr, int i, int j){

        if(j == n){
            List<Integer> a = new ArrayList<>();
            for(int m:dp) a.add(m);
            arr.add(a);
            return;
        }
        if(j==0 || j==n-1){
            dp[j] = 1;
        }else{
            dp[j] = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
        }
        pascal(n, dp, arr, i, j+1);
    }
}