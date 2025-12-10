class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
       
        for(int i=0;i<nums.length; i++){
          arr.add(index[i], nums[i]);
        }

        for(int i=0;i<arr.size();i++){
          nums[i] = arr.get(i);
        }

        return nums;
    }
}