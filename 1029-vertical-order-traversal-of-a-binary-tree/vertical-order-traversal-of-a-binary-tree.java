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
    Map<Integer,List<int[]>> map = new TreeMap<>();

    public void solve(TreeNode root, int row, int col){
      if(root == null) return;

      
      map.computeIfAbsent(col, k->new ArrayList<>()).add(new int[]{row, root.val});

      solve(root.left, row+1, col-1);
      solve(root.right, row+1, col+1);

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        solve(root, 0, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for(List<int[]> list:map.values()){
          Collections.sort(list, (a,b)->{
              if(a[0]==b[0]) return a[1]-b[1];
              return a[0]-b[0];
          });


          List<Integer> temp = new ArrayList<>();
          for(int []e:list){
            temp.add(e[1]);
          }
          ans.add(temp);
        }
        return ans;
    }
}