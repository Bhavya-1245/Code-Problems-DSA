class Solution {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.
        
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<leftIndex.size();i++){
            int l = leftIndex.get(i);
            int r = rightIndex.get(i);

            int []prefix = new int[r+1];
            prefix[l] = arr.get(l);
            int max = prefix[l];

            for(int j = l+1; j<=r;j++){
                prefix[j] = arr.get(j) + prefix[j-1];
                max = Math.max(max, prefix[j]);
            }
            res.add(max);
        }
        

        return res;
    }
}
