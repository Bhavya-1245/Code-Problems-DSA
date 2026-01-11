class Solution {
    static int n1, n2, n;
    static int[] merge(int []nums1, int nums2[]){
      int []temp = new int[n];
      int i=0, j=0, k=0;
      while(i<n1 && j<n2){
        if(nums1[i]>nums2[j]){
          temp[k++] = nums2[j++];
        }else{
          temp[k++] = nums1[i++];
        }
      }

      while(i<n1) temp[k++] = nums1[i++];
      while(j<n2) temp[k++] = nums2[j++];
      List<Integer> arr = Arrays.stream(temp).boxed().toList();
      System.out.println(arr);
      return temp;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        n1 = nums1.length; n2 = nums2.length; n = n1+n2;
        int []ans = merge(nums1, nums2);
        if(n%2 == 0){
          double a = (ans[n/2] + ans[(n-1)/2]) / 2.0;
          return a;
        }
        return ans[n/2];
    }
}