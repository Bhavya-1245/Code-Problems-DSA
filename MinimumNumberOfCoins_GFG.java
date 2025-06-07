// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int []currency={2000,500,200,100,50,20,10,5,2,1};
        
        List<Integer> arr=new ArrayList<>();
        int i=0;
        while(N>0){
            int notes=N/currency[i];
            while(notes-->0){
                arr.add(currency[i]);
            }
            N%=currency[i];
            i++;
        }
        return arr;
    }
}
