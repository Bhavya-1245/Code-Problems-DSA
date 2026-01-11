class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] merge=new int[n];
        double med;
        for(int i=0;i<n;i++){
            if(i<nums1.length){
                merge[i]=nums1[i];
            }else{
                merge[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(merge);
        if(n%2==0){
            med=(merge[n/2]+merge[(n-1)/2])/2.0;
        }else{
            med=merge[n/2];
        }
        return med;
    }
}