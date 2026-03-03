class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-2;i++){
            int new_target = target - arr[i];
            
            int left = i+1;
            int right = arr.length-1;
            
            while(left<right){
                int sum = arr[left] + arr[right];
                if(sum == new_target) return true;
                else if(sum>new_target) right--;
                else left++;
            }
        }
        
        return false;
    }
}
