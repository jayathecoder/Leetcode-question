class Solution {
     class Pair {
        int i, j;
        
        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public int[][] updateMatrix(int[][] mat){
         int m = mat.length, n = mat[0].length;
        int[][] dist = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1) dist[i][j] = Integer.MAX_VALUE;
                else q.add(new Pair(i, j));
            }
        }
        int[] dir = {-1, 0, 1, 0, -1};
        while(!q.isEmpty()){
            int i = q.peek().i;
            int j = q.peek().j;
            q.remove();
            for(int k = 0; k < 4; k++){
                int r = i + dir[k], c = j + dir[k + 1];
                if(r >= 0 && c >= 0 && r < m && c < n){
                    if(dist[r][c] > dist[i][j] + 1){
                        dist[r][c] = dist[i][j] + 1;
                        q.add(new Pair(r, c));
                    }
                }
            }
        }
        return dist;
    }
}