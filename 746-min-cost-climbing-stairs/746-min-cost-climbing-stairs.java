class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0 , b = 0;
        for(int i = cost.length-1;i>=0;i--)
        {
            int ans = cost[i]+Math.min(a,b);
            a = b;
            b = ans;
        }
        return Math.min(a,b);
    }
}