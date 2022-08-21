class Solution {
    public boolean canFinish(int num, int[][] req) {
        Map<Integer, List<Integer>> graph=new HashMap<>();
        int[] mem=new int[num];
        for(int[] pre : req){ //putting all the prerequest on top of the course under it
            graph.putIfAbsent(pre[1], new ArrayList());
            graph.get(pre[1]).add(pre[0]);
            mem[pre[0]]++;
        }

        Queue<Integer> q=new LinkedList<>();//using queue to go through bfs
        for(int i=0;i<mem.length;i++){
            if(mem[i]==0){
                q.offer(i); //marking all the courses with no prerequest into the queue
            }
        }
        
        int count=0;
        while(!q.isEmpty()){    //loop through the courses with finished prerequest or no prerequest
            int size=q.size();
            for(int i=0;i<size;i++){
                int top=q.poll();   
                count++;        //counting how many courses that were inside of the queue
                List<Integer> list=graph.get(top);  
                if(list==null) break;       // this main there are no cycle and the graph reached its end
                for(int x: list){       //adding all the courses from the prerequest course 
                    if(--mem[x]==0){    //if no more prerequests are needed
                        q.offer(x);
                    }
                }
            }
            
        }
        return count==num;      //if the amount of course with finishable prerequests are meet
    }
}