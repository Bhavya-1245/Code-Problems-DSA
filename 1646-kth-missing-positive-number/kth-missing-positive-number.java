class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length-1, ans = arr.length;

        while(start<=end){
            int mid = (end+start)/2;

            if(arr[mid]-mid-1>=k){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans+k;
    }
}