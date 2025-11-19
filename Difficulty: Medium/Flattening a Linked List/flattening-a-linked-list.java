/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
       ArrayList<Integer> arr = new ArrayList<>();
       Node dummy = new Node(-1);
       next_func(root, arr);
       sort(arr, 0, arr.size()-1);
       merge(dummy, arr, 0);
       
       return dummy.bottom;
    }
    
    
    public static void next_func(Node root, List<Integer> arr){
        if(root == null) return;
        
        bottom_func(root, arr);
        next_func(root.next, arr);
    }
    
    public static void bottom_func(Node root, List<Integer> arr){
        if(root == null) return;
        
        arr.add(root.data);
        
        bottom_func(root.bottom, arr);
    }
    
    public static void sort(List<Integer> arr, int s, int e){
        for(int i=0; i<e; i++){
            for(int j=0; j<e-i; j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
    
    public static void merge(Node temp, List<Integer> arr, int i){
        if(i==arr.size()) return;
        
        temp.bottom = new Node(arr.get(i));
        
        merge(temp.bottom, arr, i+1);
    }
    
    
    
    
    
    
}