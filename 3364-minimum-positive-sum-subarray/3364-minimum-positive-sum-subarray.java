class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] prefixSum = new int[nums.size() + 1];

        for(int i = 1; i <= nums.size(); i++){
            prefixSum[i] = prefixSum[i-1] + nums.get(i-1);
        }

        int min = Integer.MAX_VALUE;

        int count = 0;
        for(int i = l; i <= r; i++){
            for(int j = 0; j + i <= nums.size(); j++){
                int sum = prefixSum[j+i] - prefixSum[j];
                if(sum > 0 && sum < min) min = sum;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}