class Solution {
    public int[] rearrangeArray(int[] nums) {
       int even_idx =0,odd_idx =1;
        int[] ans = new int[nums.length];
        
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i] >= 0)
            {
                ans[even_idx] = nums[i];
                even_idx += 2;
            }
            
            else
            {
                ans[odd_idx] = nums[i];
                odd_idx += 2;
            }
        }
        return ans;            
    }
}