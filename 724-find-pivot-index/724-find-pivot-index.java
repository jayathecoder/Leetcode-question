class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            int leftSum=0,rightSum=0;
            for(int j=i-1;j>=0;j--){
                leftSum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            if(leftSum==rightSum){
                index=i;
                break;
            }
        }
        return index;
    }
}