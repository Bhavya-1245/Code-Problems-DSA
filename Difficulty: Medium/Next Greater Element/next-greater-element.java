class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        
        
        for(int i=0;i<arr.length;i++){
            int choice = 0;
            int j = i+1;
            
            for(;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res.add(arr[j]);
                    choice = 1;
                    break;
                }
            }
            
            if(choice == 0 ){
                res.add(-1);
            }
        }
        
        return res;
    }
}