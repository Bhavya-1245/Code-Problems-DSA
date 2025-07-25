class Solution {
    public int[] countBits(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp, 0);

        for(int i=0;i<=n;i++){
            int j=i;
            StringBuilder sb = new StringBuilder();

            while(j>0){
                sb.append(j%2);
                j/=2;
            }
            int c=0;
            for(int k=0;k<sb.length();k++){
                if(sb.charAt(k)=='1') c++;
            }
            dp[i]=c;
        }
        return dp;
    }
}