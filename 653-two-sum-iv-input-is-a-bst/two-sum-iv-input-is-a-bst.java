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

     
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return find(root, seen, k);
    }

    public static boolean find(TreeNode root, Set<Integer> seen, int k){
      if(root==null) return false;

      int com =  k - root.val;
      if(seen.contains(com)){
        return true;
      }

      seen.add(root.val);

      return find(root.left, seen, k) || find(root.right, seen, k);
    }
}