class Solution {
    public static void dfs(int i,int j,int n,int m,int[][] grid2){
        if(i<0||j<0||i>=n||j>=m||grid2[i][j]==0) return;
        grid2[i][j]=0;
        dfs(i+1,j,n,m,grid2);
        dfs(i-1,j,n,m,grid2);
        dfs(i,j+1,n,m,grid2);
        dfs(i,j-1,n,m,grid2);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n=grid2.length;
        int m=grid2[0].length;
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j]==0 && grid2[i][j]==1){
                    dfs(i,j,n,m,grid2);
                }
            }
        }
        
        int count=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    count++;
                    dfs(i,j,n,m,grid2);
                }
            }
        }
        return count;
    }
}