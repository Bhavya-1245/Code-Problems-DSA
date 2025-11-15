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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
          List<Integer> arr = new ArrayList<>();
          int levelSize = q.size();

          for(int i=0; i<levelSize; i++){
            TreeNode curr = q.poll();
            arr.add(curr.val);
            if(curr.left != null){
              q.offer(curr.left);
            }
            if(curr.right != null){
              q.offer(curr.right);
            }
          }

          result.add(arr);
        }

        return result;

        
    }
}