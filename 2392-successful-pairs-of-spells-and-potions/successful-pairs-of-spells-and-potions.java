class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      int n = potions.length;
      int m = spells.length;
      Arrays.sort(potions);
      for(int i=0; i<m; i++){
        int ind = binary(potions, n, spells[i], success);

        if(ind>-1){
          spells[i] = n-ind; 
        }else{
          spells[i] = 0;
        }
      }

      return spells;

    }

    public static int binary(int []pot, int n, int s, long suc){
      int start = 0;
      int end = n-1;
      int ind = -1;
      while(start<=end){
        int mid = start +(end-start)/2;

        if((long)pot[mid]*s>=suc){
          ind = mid;
          end = mid-1;
        }else{
          start = mid+1;
        }
      }

      return ind;
    }
}