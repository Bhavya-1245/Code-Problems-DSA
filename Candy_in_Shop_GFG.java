// User function Template for Java

class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        // code here
        Arrays.sort(candies);
        ArrayList<Integer> can = new ArrayList<>();
        int s=0, e=N-1;
        int min = 0, max = 0;
        while(s<=e){
            min += candies[s];
            int i=1;
            while(i<=K){
                e--;
                i++;
            }
            s++;
        }
        can.add(min);
        
        s=0;
        e=N-1;
        while(e>=s){
            max += candies[e];
            int i=1;
            while(i<=K){
                s++;
                i++;
            }
            e--;
        }
        can.add(max);
        
        return can;
    }
}
