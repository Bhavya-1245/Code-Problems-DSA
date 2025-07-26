class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=3) return false;
        int sum=0;
        int i=1;
        while(i<num){
            if(num%i==0) sum+=i;
            i++;
        }
        return sum==num;
    }
}