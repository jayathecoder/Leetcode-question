class Solution {
    public boolean validTree(int n, int[][] edges) {
        // A valid tree with n nodes must have exactly n - 1 edges
        if (edges.length != n - 1) return false;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        
        // Traverse starting from node 0
        dfs(graph, visited, 0);

        // Verify all nodes are connected
        for (boolean seen : visited) {
            if (!seen) return false;
        }

        return true;
    }

    private void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }
}