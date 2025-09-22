class Solution {
    public int[] sortArray(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        mergeSort(nums, s, e);

        return nums;
    }

    public static void mergeSort(int []nums, int s, int e){
        if(s<e) {

            int mid = (s+e-1)/2;
            mergeSort(nums, s, mid);
            mergeSort(nums, mid+1, e);

            merge(nums, s, mid, e);
        }
    }

    public static void merge(int []nums, int s, int mid, int e){

        int []temp1 = new int[mid-s+1];
        int []temp2 = new int[e-mid];

        int n = mid-s+1;
        int m = e-mid;

        int a = 0, b = 0;
        for(int i = 0; i<n;i++) temp1[a++]=nums[i+s];
        for(int i = 0; i<m;i++) temp2[b++]=nums[i+mid+1];
        int i=0, j=0, k=s;

        while(i<n && j<m){
            if(temp1[i]<=temp2[j]){
                nums[k++] = temp1[i++];
            }else{
                nums[k++] = temp2[j++];
            }
        }

        while(i<n) nums[k++] = temp1[i++];
        while(j<m) nums[k++] = temp2[j++];
    }
}