class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int []idx = new int[11111];
        
        for(int i=0;i<nums2.length;i++){
            idx[nums2[i]] = i;
        }
        
        for(int i=0; i<nums1.length; i++){
            nums1[i] = greatest(nums2, idx[nums1[i]]);
        }

        return nums1;
    }

    public static int greatest(int []nums2, int idx){
        int m = nums2.length;

        for(int i=idx+1;i<m;i++){
            if(nums2[i]>nums2[idx]) return nums2[i];
        }
        return -1;
    }
}