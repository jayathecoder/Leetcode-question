class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;

        for(int i=0; i < nums.length; i++){

            // element is not zero then swap
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex++] = temp;
            }
        }
    }
}