// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        int carry = 0;
        Collections.reverse(arr);
        
        arr.set(0, arr.get(0)+1);
        for(int i=0;i<N;i++){
            if(arr.get(i)<10) break;
            int r = arr.get(i)%10;
            carry = arr.get(i)/10;
            arr.set(i, r);
            if(i<N-1) {
                arr.set(i+1, arr.get(i+1) + carry);
                carry = 0;
            }
            
            
        }
        
        if(carry!=0) arr.add(carry);
        
        Collections.reverse(arr);
        return arr;
    }
};