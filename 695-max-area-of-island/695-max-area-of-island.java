class Solution {
  
   
    public int maxAreaOfIsland(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    max=Math.max(max,dfs(grid,i,j,n,m));
            }
        }
        
        return max;
    }
    
     public int dfs(int[][] grid,int row,int col,int n,int m){
        if(row<0 ||col<0||row==n||col==m||grid[row][col]!=1) 
            return 0;
        grid[row][col]=2;
        
        return (1+dfs(grid,row,col+1,n,m)+
                dfs(grid,row,col-1,n,m)+
                dfs(grid,row+1,col,n,m)+
                dfs(grid,row-1,col,n,m));
        }
        
}