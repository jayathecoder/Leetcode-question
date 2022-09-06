class Solution {
    public int deleteAndEarn(int[] nums) {
          int []freq=new int[10003];
        for(int val:nums)
            freq[val]+=1;
        int []dp=new int[10003];
        dp[1]=freq[1];
        for(int i=2;i<freq.length;i+=1){
            dp[i]=Math.max(dp[i-1],dp[i-2]+(freq[i]*i));
         }
        return dp[dp.length-1];
    
    }
}