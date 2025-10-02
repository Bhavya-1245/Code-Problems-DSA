class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        numBottles = 0;
        while(empty>=numExchange){
            while(empty>=numExchange){
                empty = empty - numExchange;
                numBottles+=1;
                numExchange++;
            }

            if(numBottles>0){
                total += numBottles;
                empty += numBottles;
                numBottles = 0;
            }
            else break;
            
        }

        return total;
    }
}