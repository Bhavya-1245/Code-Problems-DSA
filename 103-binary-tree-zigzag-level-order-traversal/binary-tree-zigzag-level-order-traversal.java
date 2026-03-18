/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
          int size = q.size();
          List<Integer> temp = new ArrayList<>();

          while(size-->0){
            TreeNode temp1 = q.poll(); 
            
            if(flag) temp.add(temp1.val);
            else temp.add(0, temp1.val);

            if(temp1.left!=null) q.add(temp1.left);
            if(temp1.right!=null) q.add(temp1.right);
            
          }

          flag = !flag;
          ans.add(temp);
        }

        return ans;
        
    }
}