class Solution {
    private class Engineer{
        int speed,efficiency;
        public Engineer(int s,int e){
            speed=s;
            efficiency=e;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        ArrayList<Engineer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Engineer(speed[i],efficiency[i]));
        }
        
        arr.sort((a,b)->b.efficiency-a.efficiency);
        
        PriorityQueue<Engineer> pr=new PriorityQueue<>((a,b)->a.speed-b.speed);
        
        long teamSpeed=0;
        long maxPerformance=0;
        
        for(Engineer newEr:arr){
            if(pr.size()==k){
                Engineer slowEr=pr.poll();
                teamSpeed-=slowEr.speed;
            }
            pr.add(newEr);
            teamSpeed+=newEr.speed;
            long performanceWithNewEr=teamSpeed*(long)newEr.efficiency;
            maxPerformance=Math.max(maxPerformance,performanceWithNewEr);
        }
        return (int)(maxPerformance%1000000007);
    }
}