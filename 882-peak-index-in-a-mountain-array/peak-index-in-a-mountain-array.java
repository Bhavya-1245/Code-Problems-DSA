class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1, mid=-1;

        while(start<=end){
            mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}