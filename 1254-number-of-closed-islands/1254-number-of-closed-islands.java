class Solution {
    boolean flag=true;
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int seen[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 && seen[i][j]==0){
                    flag=true;
                    dfs(i,j,n,m,grid,seen);
                    if(flag) count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(int row,int col,int n,int m,int[][] grid,int[][] seen){
        if(row<0||col<0||row>=n||col>=m||grid[row][col]!=0||seen[row][col] == 1)
            return;
         if(row == 0 || row ==n-1|| col == 0 || col ==m-1) {
            flag = false;
        }
        seen[row][col]=1;
        grid[row][col]=2;
        dfs(row,col+1,n,m,grid,seen);
        dfs(row,col-1,n,m,grid,seen);
        dfs(row+1,col,n,m,grid,seen);
        dfs(row-1,col,n,m,grid,seen);
    }
}