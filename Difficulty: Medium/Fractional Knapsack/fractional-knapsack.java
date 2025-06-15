class Solution {
    
    static class Item{
        int value,weight;
        double ratio;
        
        Item(int v, int w){
            value=v;
            weight=w;
            ratio=(double)v/w;
        }
    }
    
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=values.length;
        
        ArrayList<Item> arr=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr.add(new Item(values[i], weights[i]));
        }
        
       arr.sort((a,b)->Double.compare(b.ratio,a.ratio));
        
        int N=W; 
        double val=0;
        int i=0;
        for(Item item:arr){
            if(item.weight<=N){
                val+=item.value;
                N-=item.weight;
            }else{
                val+=N*item.ratio;
                break;
            }
        }
        
        return val;
    }
}