class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSize=0, bobSize=0;

        for(int i:aliceSizes){
          aliceSize+=i;
        }
        for(int i:bobSizes){
          bobSize+=i;
        }

        int diff = (bobSize-aliceSize)/2;

        Set<Integer> bob = new HashSet<>();
        for(int size:bobSizes) bob.add(size);

        for(int x:aliceSizes){
          int y = x + diff;

          if(bob.contains(y)){
            return new int[]{x,y};
          }
        }
        return new int[0];
    }
}