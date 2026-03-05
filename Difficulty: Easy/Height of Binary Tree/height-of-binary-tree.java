/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root==null) return -1;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}