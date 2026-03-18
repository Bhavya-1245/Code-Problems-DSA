/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    boolean isLeaf(Node root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
    
    void leafView(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        
        leafView(root.left, ans);
        leafView(root.right, ans);
    }
    
    void rightView(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        
        Stack<Integer> st = new Stack<>();
        
        while(root!=null){
            if(!isLeaf(root)) st.push(root.data);
            
            if(root.right!=null) root = root.right;
            else root = root.left;
        }
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        
    }
    
    void leftView(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        
        if(isLeaf(root)) {
            return;
        }
        
        ans.add(root.data);
        
        
        if(root.left!=null) leftView(root.left, ans);
        
        else leftView(root.right, ans);
    }
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root==null) return ans;
        
        ans.add(root.data);
        
        if(isLeaf(root)) return ans;
        
        leftView(root.left, ans);
        leafView(root, ans);
        rightView(root.right, ans);
        
        return ans;
    }
}