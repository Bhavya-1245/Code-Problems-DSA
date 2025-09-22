class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i:nums){
            if(arr.indexOf(i)==-1){
                arr.add(i);
            }
        }
        int size = arr.size();

        for(int i=0; i<arr.size(); i++){
            nums[i] = arr.get(i);
        }

        return size;
    
    }
}