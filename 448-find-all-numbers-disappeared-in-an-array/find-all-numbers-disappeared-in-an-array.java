class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int []freq = new int[nums.length+1];

        List<Integer> res = new ArrayList<>();

        for(int i:nums) freq[i]++;

        for(int i=1;i<=nums.length;i++){
          if(freq[i]==0) res.add(i);
        }

        return res;
    }
}