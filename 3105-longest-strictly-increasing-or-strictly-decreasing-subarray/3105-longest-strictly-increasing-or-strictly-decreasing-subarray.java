class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 0, dec = 0;

        for(int i = 0; i < nums.length; i++){
            int c1 = 1;
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] > nums[j-1]) c1++;
                else break;
            }
            inc = Math.max(inc, c1);
        }

        for(int i = 0; i < nums.length; i++){
            int c1 = 1;
            for(int j=i+1; j < nums.length; j++){
                if(nums[j] < nums[j-1]) c1++;
                else break;
            }
            dec = Math.max(dec, c1);
        }

        return Math.max(inc, dec);
    }
}