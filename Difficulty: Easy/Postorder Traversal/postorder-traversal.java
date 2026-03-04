/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static void solve(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        
        solve(root.left, ans);
        solve(root.right, ans);
        ans.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        
        if(root == null) return new ArrayList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans);
        return ans;
    }
}