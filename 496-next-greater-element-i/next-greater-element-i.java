class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int []res = new int[nums1.length];
        Arrays.fill(res, -1);
        int []ans = new int[nums2.length];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                ans[st.peek()] = nums2[i];
                st.pop();
            }
            st.push(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums2) arr.add(i);
        for(int i=0; i<nums1.length; i++){
            if(ans[arr.indexOf(nums1[i])]==0) res[i] = -1;
            else res[i] = ans[arr.indexOf(nums1[i])];
        }

        return res;
    }
}