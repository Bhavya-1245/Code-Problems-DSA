class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for(int i:nums) num.add(i);

        for(int i=0;i<=num.size();i++){
            if(!(num.contains(i))) return i;
        }
        
        return -1;
    }
}