class Solution {
    public int check(char[][] grid,int i,int j){
        
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
            return 0;
        }
        
        grid[i][j]='0';
        check(grid,i+1,j);
        check(grid,i-1,j);
        check(grid,i,j+1);
        check(grid,i,j-1);
        return 1;
    }
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) {
            return 0;
        }
        int result=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                  result+=check(grid,i,j);
                }
            }
        }
        return result;
        
    }
}