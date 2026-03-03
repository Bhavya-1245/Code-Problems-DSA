class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;

        while(mid<=right){
          int choice = nums[mid];
          switch(choice){
            case 0: int temp = nums[left];
                    nums[left] = nums[mid];
                    nums[mid] = temp;
                    left++; mid++;
                    break;
            case 1: mid++; break;
            case 2: int temp1 = nums[right];
                    nums[right] = nums[mid];
                    nums[mid] = temp1;
                    right--;
          }
        }
    }
}