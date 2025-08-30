class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        
        int n=arr.length;
        ar.add(arr[n-1]);
        int a=0;
        for(int i=n-1;i>0;i--){
            if(!(arr[i]>arr[i-1])&&ar.get(a)<=arr[i-1]){
                ar.add(arr[i-1]);
                a++;
            }
        }
        Collections.reverse(ar);
        return ar;
    }
}
