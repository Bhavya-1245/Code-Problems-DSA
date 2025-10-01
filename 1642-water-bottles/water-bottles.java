class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange) return numBottles;
        int total_drink = numBottles;
        int empty_bottles = numBottles;

        while(empty_bottles>=numExchange){
            int newFullBottles = empty_bottles/numExchange;
            int remaining = empty_bottles%numExchange;

            total_drink += newFullBottles;
            empty_bottles = remaining + newFullBottles;
        }

        return total_drink;
       
    }
}