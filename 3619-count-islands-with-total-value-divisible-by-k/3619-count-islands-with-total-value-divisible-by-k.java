class Solution {
    public long dfs(int[][] grid, int[][] visited, int r, int c, int n, int m){
        long curr = grid[r][c];
        visited[r][c] = 1;

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        for(int i=0; i < 4; i++){
            int nr = r + deltaRow[i];
            int nc = c + deltaCol[i];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] != 0 && visited[nr][nc] == 0){
                curr += dfs(grid, visited, nr, nc, n, m);
            }
        }


        return curr;
    }
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0 && visited[i][j] == 0){
                    long val = dfs(grid, visited, i, j, n, m);
                    if(val % k == 0) count++;
                }
            }
        }

        return count;
    }
}