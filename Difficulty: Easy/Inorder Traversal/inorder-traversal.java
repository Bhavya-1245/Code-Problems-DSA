/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    static void solve(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        
        solve(root.left, ans);
        ans.add(root.data);
        solve(root.right, ans);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        
        if(root == null) return new ArrayList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans);
        return ans;
    }
}