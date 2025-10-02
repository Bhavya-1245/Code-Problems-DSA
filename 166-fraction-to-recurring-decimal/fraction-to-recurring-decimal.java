class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        if((numerator<0) != (denominator<0)) result.append("-");

        long N = Math.abs((long)numerator);
        long D = Math.abs((long)denominator);

        long integerPart = N / D;
        result.append(integerPart);

        long remainder = N % D;

        if(remainder==0) return result.toString();

        result.append(".");

        Map<Long, Integer> remainderMap = new HashMap<>();

        while(remainder!=0){
            if(remainderMap.containsKey(remainder)){
                int cycleStart = remainderMap.get(remainder);

                result.insert(cycleStart, "(");

                result.append(")");
                return result.toString();
            }

            remainderMap.put(remainder, result.length());

            remainder *= 10;
            result.append(remainder/D);
            remainder %= D; 
        }

        return result.toString();

        

        
        
    }
}