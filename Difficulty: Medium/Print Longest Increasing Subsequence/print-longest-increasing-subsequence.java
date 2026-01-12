class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n = arr.length;
        int []parent = new int[n];
        int []dp = new int[n];
        Arrays.fill(parent, -1);
        Arrays.fill(dp, 1);
        int maxi = 1, lastidx = 0;   
        
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i] && dp[j]+1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                    if(maxi<dp[i]){
                        maxi = dp[i];
                        lastidx = i;
                    }
                }
                
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(lastidx!=-1){
            ans.add(arr[lastidx]);
            lastidx = parent[lastidx];
        }
        Collections.sort(ans);
        return ans;
    }
}
