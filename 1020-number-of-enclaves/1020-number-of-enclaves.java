class Solution {
     public static void dfs(int row,int col,int n,int m,int[][] grid){
        if(row<0||col<0||row>=n||col>=m||grid[row][col]==0) return;
        grid[row][col]=0;
        dfs(row,col+1,n,m,grid);
        dfs(row,col-1,n,m,grid);
        dfs(row+1,col,n,m,grid);
        dfs(row-1,col,n,m,grid);
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    if(grid[i][j]==1)
                        dfs(i,j,n,m,grid);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }
}