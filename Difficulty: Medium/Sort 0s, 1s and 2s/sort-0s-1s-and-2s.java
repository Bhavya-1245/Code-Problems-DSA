class Solution {
    public void sort012(int[] nums) {
        // code here
        int left =0, mid = 0;
        int right = nums.length - 1;
        // int temp = 0;
        while(mid<=right){
            int c = nums[mid];
            
            switch(c){
                case 0: int temp = nums[mid];
                        nums[mid] = nums[left];
                        nums[left] = temp;
                        left++; mid++; break;
                case 1: mid++; break;
                case 2: int temp1 = nums[mid];
                        nums[mid] = nums[right];
                        nums[right] = temp1;
                        right--;
            }
        }
    }
}