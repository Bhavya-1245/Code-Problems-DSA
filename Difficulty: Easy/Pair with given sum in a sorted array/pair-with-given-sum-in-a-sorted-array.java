// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0, left=0, right = arr.length-1;
        
        while(left<right){
            int sum = arr[left] + arr[right];
            
            if(sum == target){
                
                // for same elements
                if(arr[left] == arr[right]){
                    int len = right - left + 1;
                    count += len*(len-1)/2;
                    break;
                }
                
                // for duplicate elements
                
                int left_cnt = 1;
                while(left<right && arr[left] == arr[left+1]){
                    left_cnt++;
                    left++;
                }
                
                int right_cnt = 1;
                while(left<right && arr[right] == arr[right-1]){
                    right_cnt++;
                    right--;
                }
                
                
                count += left_cnt*right_cnt;
                left++;
                right--;
            }
            else if(sum>target) right--;
            else left++;
        }
        
        return count;
    }
}
