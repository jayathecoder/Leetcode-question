class Solution {
    public int maxSubArray(int[] nums) {
         int currsum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num : nums){
            
            if(currsum < 0) currsum = 0;
            
            currsum += num;
            
            max = Math.max(max, currsum);
            
        }
        
        return max;
        
    }
}