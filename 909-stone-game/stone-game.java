class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int sum_A = 0;
        int sum_B = 0;

        int i = 0, j = n-1;
        int chance = 0;
        while(n!=0){
          int val = piles[i]>piles[j] ? piles[i++]:piles[j--];
          int val1 = piles[i]<piles[j] ? piles[i++]:piles[j--];
          
            sum_A += val;
            
          
          
            sum_B += val1;
            
          n-=2;
        }

        return sum_A>sum_B;
    }
    
}