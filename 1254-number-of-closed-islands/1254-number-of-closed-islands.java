class Solution {
    public void dfs(int[][] grid, int[][] visited, int r, int c, int n, int m){
        visited[r][c] = 1;

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        for(int i=0; i<4; i++){
            int nr = r + deltaRow[i];
            int nc = c + deltaCol[i];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && visited[nr][nc] == 0){
                dfs(grid, visited, nr, nc, n, m);
            }
        }
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int[][] visited = new int[n][m];

        for(int i=0; i < n; i++){
            if(grid[i][0] == 0) dfs(grid, visited, i, 0, n, m);
            if(grid[i][m-1] == 0) dfs(grid, visited, i, m-1, n, m);
        }

        for(int j = 0; j < m; j++){
            if(grid[0][j] == 0) dfs(grid, visited, 0, j, n, m);
            if(grid[n-1][j] == 0) dfs(grid, visited, n-1, j, n, m);
        }

        int closed = 0;

        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                if(grid[i][j] == 0 && visited[i][j] == 0){
                    dfs(grid, visited, i, j, n, m);
                    closed++;
                }
            }
        }

        return closed;
    }
}