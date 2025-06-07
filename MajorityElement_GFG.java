// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int n=arr.length;
        
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }
        return -1;
    }
}
