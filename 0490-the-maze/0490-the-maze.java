class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        Queue<int[]> q = new LinkedList<>();
        int n = maze.length, m = maze[0].length;

        int[][] visited = new int[n][m];

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        q.add(new int[]{start[0], start[1]});
        visited[start[0]][start[1]] = 1;

        while(!q.isEmpty()){
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];

            if(r == destination[0] && c == destination[1]) return true;

            for(int i = 0; i < 4; i++){
                int nr = r + deltaRow[i];
                int nc = c + deltaCol[i];

                if(nr < 0 && nr >= n && nc < 0 && nc >= m) continue;

                while(nr >= 0 && nr < n && nc >= 0 && nc < m && maze[nr][nc] == 0){
                    nr += deltaRow[i];
                    nc += deltaCol[i];
                }

                // Revert the last move to get the cell to which the ball rolls.
                nr -= deltaRow[i];
                nc -= deltaCol[i];

                if(visited[nr][nc] == 0){
                    visited[nr][nc] = 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return false;
    }
}