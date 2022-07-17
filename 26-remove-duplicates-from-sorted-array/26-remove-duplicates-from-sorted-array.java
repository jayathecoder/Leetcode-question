class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums.length <= 1) return nums.length;
        int lastVal = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                lastVal = i;
                for(int j = i + 1;j <nums.length;j++){
                    if(nums[j] == nums[i])continue;
                    if(nums[j]== nums[lastVal])continue;
                    nums[++lastVal] = nums[j];
                }
                return lastVal + 1;
            }
        }
        return nums.length; 
    }
}