class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
          if(digits[i]<9){
            digits[i]++;
            return digits;
          }

          digits[i] = 0;
        }

        int []new_arr = new int[digits.length+1];
        new_arr[0] = 1;
        return new_arr;
    }
}