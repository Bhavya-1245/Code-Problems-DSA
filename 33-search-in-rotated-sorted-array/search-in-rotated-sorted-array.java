class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
          if(!map.containsKey(nums[i])){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + i);
          }
        } 
        return map.containsKey(target) ? map.get(target): -1;
    }
}