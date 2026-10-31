class Solution {
    static final int MOD = 1_000_000_007;
    public int dfs(int[][] grid, int i, int j, int m, int n, int[][] dp) {

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int right = move(grid, i, j + 1, 0, m, n, dp);
        int down = move(grid, i + 1, j, 1, m, n, dp);

        return dp[i][j] = (int)(((long)right + down)%MOD);
    }

    // direction: 0 = entered while moving right
    //            1 = entered while moving down
    public int move(int[][] grid, int i, int j, int direction, int m, int n, int[][] dp) {

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (grid[i][j] == 0) {
            return dfs(grid, i, j, m, n, dp);
        }

        if (direction == 0) {
            return move(grid, i + 1, j, 1, m, n, dp);
        } else {
            return move(grid, i, j + 1, 0, m, n, dp);
        }
    }

    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];

        for(int[] d: dp) Arrays.fill(d, -1);

        return dfs(grid, 0, 0, m, n, dp);
    }
}