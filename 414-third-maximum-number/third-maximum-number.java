class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;

        long sec_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for(int i:nums){
            long current = i;
            if(current>max) {
                third_max = sec_max;
                sec_max = max;
                max = current; 
            }
            else if(current<max && current>sec_max) {
                third_max = sec_max;
                sec_max = current;
            }else if(current<sec_max && current> third_max){
                third_max = current;
            }
            
        }

        if(third_max==Long.MIN_VALUE) third_max = max;

        return (int)third_max;
    }
}