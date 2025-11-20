class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;

        return binary(nums, 0, nums.length-1, target);
    }

    public static int binary(int []arr, int s, int e, int target){
      if(s>e) return -1;

      int mid = s + (e-s)/2;

      if(arr[mid]==target) return mid;
      else if(arr[mid]>target) return binary(arr, s, mid-1, target);
     
      return binary(arr, mid+1, e, target);

      // return binary(arr, s, e, target);

    }
}