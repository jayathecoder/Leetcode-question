class Solution {
    public boolean bfsCheck(int[][] graph,int[] color,int node,int parent){
         color[node] = parent == -1 ? 0 : 1 - color[parent];
        
        for(int i=0;i<graph[node].length;i++) {
            if(color[graph[node][i]] == -1 ) {
                if( !bfsCheck(graph,color,graph[node][i],node)) return false;
            }
            else if(color[graph[node][i]] == color[node]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        
        for(int i=0;i<n;i++){
            color[i]=-1; 
        }
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(bfsCheck(graph,color,i,-1)==false) return false;
            }
        }
        return true;
    }
}