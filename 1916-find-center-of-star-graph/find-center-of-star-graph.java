class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int []freq = new int[n+1];

        for(int i=0; i<n-1; i++){
          freq[edges[i][0]]++;
          freq[edges[i][1]]++;
        }
        int star = 1;

        for(int i=1;i<n+1;i++){
          if(freq[star]<freq[i]) star = i;
        }
        return star;
    }
}