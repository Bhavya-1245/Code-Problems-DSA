class Solution {
    public boolean search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums) map.put(i, map.getOrDefault(i, 0)+1);

        return map.containsKey(target);
    }
}