class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        int ans = arr[n-1]-arr[0];
        
        for(int i=0; i<n-1;i++){
            if(arr[i+1]-k <0) continue;
            
            int min = Math.min(arr[0]+k, arr[i+1]-k);
            int max = Math.max(arr[i]+k, arr[n-1]-k);
            ans = Math.min(ans, max-min);
            
        }
        
        return ans;
    }
}
