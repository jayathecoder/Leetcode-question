class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(colors.length()==0 || colors.length()==1) return 0;
        int time=0;int prev=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(prev)){
                time+=(neededTime[i]<neededTime[prev])?neededTime[i]:neededTime[prev];
                prev= neededTime[prev] < neededTime[i] ? i: prev;
            }else {
                prev = i;
            }
        }
        return time;
    }
}