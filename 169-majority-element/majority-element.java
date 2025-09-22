class Solution {
    public int majorityElement(int[] nums) {
        

        HashMap<Integer, Integer> list = new HashMap<>();

        for(int i:nums){
            list.put(i, list.getOrDefault(i, 0)+1);
        }
        int num = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e: list.entrySet()){
            if(e.getValue()>max){
                num = e.getKey();
                max = e.getValue();
            }
        }

        return num;
    }
}