import java.util.*;

class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int n = maze.length, m = maze[0].length;
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        int[][] distance = new int[n][m];
        for (int[] dist : distance) {
            Arrays.fill(dist, Integer.MAX_VALUE);
        }

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        q.add(new int[]{start[0], start[1], 0});
        distance[start[0]][start[1]] = 0;

        while (!q.isEmpty()) {
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];
            int cost = curr[2];

            if (distance[r][c] < cost) continue;

            for (int i = 0; i < 4; i++) {
                int nr = r;
                int nc = c;
                int steps = 0;

                // Roll until hitting a wall or boundary
                while (nr + deltaRow[i] >= 0 && nr + deltaRow[i] < n &&
                       nc + deltaCol[i] >= 0 && nc + deltaCol[i] < m &&
                       maze[nr + deltaRow[i]][nc + deltaCol[i]] == 0) {
                    nr += deltaRow[i];
                    nc += deltaCol[i];
                    steps++;
                }

                // Only consider if the ball actually moved
                if (steps > 0 && cost + steps < distance[nr][nc]) {
                    distance[nr][nc] = cost + steps;
                    q.add(new int[]{nr, nc, cost + steps});
                }
            }
        }

        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distance[destination[0]][destination[1]];
    }
}