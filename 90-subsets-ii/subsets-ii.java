class Solution {
    static int n = 0;

    public static void solve(int []nums, int i, List<List<Integer>> ans, List<Integer> arr){
      if(i==n){
        if(!arr.isEmpty() && !ans.contains(arr)) ans.add(new ArrayList<>(arr));
        return;
      }

      // include
      arr.add(nums[i]);
      solve(nums, i+1, ans, arr);

      //exclude
      arr.remove(arr.size()-1);
      solve(nums, i+1, ans, arr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        solve(nums, 0, ans, new ArrayList<>());

        return ans;
    }
}