class Solution {
    public void sort012(int[] arr) {
        // code here
        int low = 0, mid = 0, high = arr.length-1;
        int temp;
        while(mid<=high){
            
            switch(arr[mid]){
                
                case 0: temp = arr[mid];
                        arr[mid] = arr[low];
                        arr[low] = temp;
                        
                        low++;
                        mid++;
                        
                        break;
                
                case 1: mid++;
                        break;
                
                case 2: temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                        
                        high--;
                        
                        
                        break;
            }
        }
    }
}