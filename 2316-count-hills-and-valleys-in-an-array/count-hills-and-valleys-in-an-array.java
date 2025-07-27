class Solution {
    public int countHillValley(int[] nums) {
        if(nums.length<2) return 0;
        int c=0;
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]) arr.add(nums[i]);
        }
        for(int i=1;i<arr.size()-1;i++){
            int prev = arr.get(i-1);
            int curr = arr.get(i);
            int next = arr.get(i+1);
            if(curr<prev && curr<next) c++;
            if(curr>prev && curr>next) c++;
        }
        return c;
    }
}