/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        if(root == null) return false;
        int remain = target-root.data;
        // Your code here
        if(root.left == null && root.right==null) return remain == 0;
        
        return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
    }
}