class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        
        for(int l=0;l<n;l+=k){
            int i = l;
            int j = Math.min(l + k - 1, n-1);
            
            while(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
    }
}