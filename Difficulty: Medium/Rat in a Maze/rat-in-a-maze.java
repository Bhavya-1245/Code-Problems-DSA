class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int r = maze.length;
        int c = maze[0].length;
        
        if(maze[0][0]==0) return new ArrayList<>();
        
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[r][c];
        ratMaze(ans, maze, visited, 0, 0, r, c, "");
        
        return ans;
    }
    
    public static void ratMaze(ArrayList<String> ans, int[][] maze, boolean[][] visited, int i, int j, int row, int col, String path){
        if(i<0 || i>=row || j<0 || j>=col || maze[i][j]==0 || visited[i][j]) return;
        if(i==row-1 && j==col-1){
            ans.add(path);
            return;
        }
        
        visited[i][j] = true;
        
        ratMaze(ans, maze, visited, i+1, j, row, col, path+"D"); // for down
        ratMaze(ans, maze, visited, i, j-1, row, col, path+"L"); // for left
        ratMaze(ans, maze, visited, i, j+1, row, col, path+"R"); // for right
        ratMaze(ans, maze, visited,  i-1, j, row, col, path+"U"); // for up
        
        
        visited[i][j] = false;
    }
}