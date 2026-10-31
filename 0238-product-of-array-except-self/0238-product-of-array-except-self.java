class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = 1;

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] * nums[i - 1];
        }

        int rightProd = 1;

        for(int i = n - 1; i >= 0; i--){
            prefixSum[i] *=  rightProd;
            rightProd *= nums[i];
        }

        return prefixSum;
    }
}