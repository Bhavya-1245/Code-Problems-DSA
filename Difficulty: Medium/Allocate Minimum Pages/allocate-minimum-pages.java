class Solution {
    
    public static boolean compute(int []arr, int mid, int k){
        int sum = 0, student = 1;
        
        for(int p:arr){
            if(p>mid) return false;
            if(p <= mid - sum){
                sum += p;
            }else{
                student++;
                if(student>k) return false;
                sum = p;
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k) return -1;
        
        int end = Arrays.stream(arr).sum();
        int low = 0;
        int ans = Integer.MAX_VALUE;
        
        while(low<=end){
            int mid = (low + end) / 2;
            
            if(compute(arr, mid, k)){
                ans = Math.min(ans, mid);
                end = mid - 1;
            }
            else low = mid + 1;
        }
        
        return ans;
    }
}