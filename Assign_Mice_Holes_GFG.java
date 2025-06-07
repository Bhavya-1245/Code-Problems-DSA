// User function Template for Java

class Solution {
    static int assignMiceHoles(int N, int[] M, int[] H) {
        // code here
        Arrays.sort(M);
        Arrays.sort(H);
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<N;i++){
            ans = Math.max(ans,Math.abs(M[i]-H[i]));
        }
        
        return ans;
    }
};
