class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
         int length = grid.length;
        if (length == 0) return -1;
        if (length == 1 && grid[0][0] == 0) return 1;
        if (grid[0][0] == 1) return -1;
        
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}, {1,1}, {-1,-1}, {1, -1}, {-1, 1}};;
        int res = 1;
        boolean[][] visited = new boolean[length][length];
        
        queue.offer(new int[] {0, 0});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            while (size > 0) {
                size--;
                int[] point = queue.poll();
                for (int[] dir : dirs) {
                    int newx = dir[0] + point[0];
                    int newy = dir[1] + point[1];
                    
                    if (newx >=0 && newy >=0 && newx < length && newy < length && !visited[newx][newy] &&
                       grid[newx][newy] == 0) {
                        if (newx == length - 1 && newy == length - 1) {
                            res++;
                            return res;
                        }
                        visited[newx][newy] = true;
                        queue.offer(new int[] {newx, newy});
                    }
                }
            }
            res++;
        }
        
        return -1;
    
    }
}