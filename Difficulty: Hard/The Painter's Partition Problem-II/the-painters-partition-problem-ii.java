class Solution {
    
    public static boolean compute(int []arr, int mid, int k){
        int sum = 0, wall = 1;
        
        for(int t: arr){
            if(t > mid) return false;
            if(t <= mid - sum){
                sum += t;
            }else{
                wall++;
                if(wall>k) return false;
                sum = t;
            }
        }
        
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        
        int end = Arrays.stream(arr).sum();
        int low = 0;
        int ans = Integer.MAX_VALUE;
        
        while(low <= end){
            int mid = (low + end)/2;
            
            if(compute(arr, mid, k)){
                ans = Math.min(ans, mid);
                end = mid - 1;
            }
            else low = mid + 1;
        }
        
        return ans;
    }
}
