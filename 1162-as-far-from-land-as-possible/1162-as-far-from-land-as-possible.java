class Solution {
    public static class Pair{
        int row,col;
        Pair(int i,int j){
            row=i;
            col=j;
        }
    }
    public int maxDistance(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                }
            }
        }
        if(q.size()==0||q.size()==grid.length*grid[0].length) return -1;
        
        int level=-1;
        int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            level++;
            int size=q.size();
            while(size-- >0){
                Pair p=q.poll();
                for(int i=0;i<4;i++){
                    int r=p.row+dir[i][0];
                    int c=p.col+dir[i][1];
                    if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==1) continue;
                    q.add(new Pair(r,c));
                    grid[r][c]=1;
                }
            }
        }
       return level;
    }
}