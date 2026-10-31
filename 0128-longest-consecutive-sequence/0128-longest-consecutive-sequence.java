class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0; // TC: O(nlogn) 
        Arrays.sort(nums);
        
        int max = 1; int count = 1;

        for(int i=1; i< nums.length; i++){
            if(nums[i-1] != nums[i]){
              if(nums[i-1] + 1 == nums[i]) 
                count += 1;
              else{
                max = Math.max(max, count);
                count = 1;
               } 
            }
        }
        return Math.max(max, count);
    }
}