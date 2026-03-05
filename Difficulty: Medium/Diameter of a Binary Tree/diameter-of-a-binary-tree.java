/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    
    static int height(Node root, int []diameter){
        if(root == null) return 0;
        
        int left = height(root.left, diameter);
        int right = height(root.right, diameter);
        
        diameter[0] = Math.max(diameter[0], left + right);
        
        return 1 + Math.max(left, right);
    }
    public int diameter(Node root) {
        // code here
        int []diameter = new int[1];
        height(root, diameter);
        
        return diameter[0];
    }
}