class Solution {
    static int n, tar;

    public static void solve(int []nums, int i, List<List<Integer>> ans, List<Integer> arr, int sum){
      if(sum == tar){
        ans.add(new ArrayList<>(arr));
        return;
      }
      if(i>=n || sum>tar){
        return;
      }
      //include
      arr.add(nums[i]);
      solve(nums, i, ans, arr, sum+nums[i]);
      //exclude
      arr.remove(arr.size()-1);
      solve(nums, i+1, ans, arr, sum);

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        n = nums.length;
        tar = target;
        solve(nums, 0, ans, new ArrayList<>(), 0);

        return ans;

    }
}