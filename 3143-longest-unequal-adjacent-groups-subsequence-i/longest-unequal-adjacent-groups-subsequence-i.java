class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> arr = new ArrayList<>();

        int i=0, a = groups[0];
        arr.add(words[i]);
        for(int j=1;j<groups.length;j++){
            if(groups[j]!=a){
                i=j;
                arr.add(words[i]);
                a=groups[j];
            }
        }

        return arr;
    }
}