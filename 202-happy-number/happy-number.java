class Solution {
    public boolean isHappy(int n) {
        
        if(n == 1 || n == 7) return true;
        
        

        while(n>9){
            int num = n;
            int sum = 0;
            while(num>0){
                sum+=Math.pow(num%10,2);
                num/=10;
            }
            if(sum == 1 || sum == 7) return true;
            n = sum;
        }

        return false;
    }
}