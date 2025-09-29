class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []res = new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int []a = new int[2*n];
        for(int i=0;i<2*n;i++) a[i] = nums[i%n];
        
        for(int i=2*n-1;i>-1;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(!st.isEmpty() && i<n) res[i] = st.peek();
            st.push(nums[i%n]);

        }

        

        return res;



    }
}