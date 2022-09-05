class Solution {
    
    int helper(int n,HashMap<Integer,Integer> map){
        if(n==1) return 1;
        if(n==2) return 2;
        if(map.containsKey(n)) return map.get(n);
        int x=helper(n-1,map)+helper(n-2,map);
        map.put(n,x);
        return x;
        
    }
    
    public int climbStairs(int n) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int result=helper(n,map);
        int dp[]=new int[50];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}