class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        
        for(int i:arr){
            if(max<i) max=i;
        }
        
        return max;
    }
}
