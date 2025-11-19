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
        List<Integer> arr = new ArrayList<>();
        
        Node temp = root;
        
        while(temp!=null){
            Node temp2 = temp;
            while(temp2!=null){
                arr.add(temp2.data);
                temp2 = temp2.bottom;
            }
            temp = temp.next;
        }
        
        arr.sort(null);
        
        Node dummy = new Node(-1);
        
        temp = dummy;
        
        for(int i: arr){
            temp.bottom = new Node(i);
            temp = temp.bottom;
        }
        
        return dummy.bottom;
    }
    
    
}