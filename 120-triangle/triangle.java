class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i=n-2; i>=0; i--){
            List<Integer> current = triangle.get(i);
            List<Integer> next = triangle.get(i+1);

            for(int j=0; j<current.size(); j++){
                int path1 = next.get(j);
                int path2 = next.get(j+1);

                int minPath = Math.min(path1, path2);
                int total = current.get(j) + minPath;
                current.set(j, total);
            }
        }

        return triangle.get(0).get(0);
    }

    
}