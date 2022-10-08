class Solution {
    public int threeSumClosest(int[] nums, int target) {
          Arrays.sort(nums);
        int n=nums.length;
        int minDiff=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<n;i++){
            int low=i+1;
            int high=n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==target)
                    return sum;
                if(sum>target){
                    if(minDiff>(sum-target)){
                        minDiff=sum-target;
                        min=sum;
                    }
                    high--;
                }
                else{
                   if(minDiff>(target-sum)){
                        minDiff=target-sum;
                        min=sum;
                    }
                    low++;
                }
            }
        }
        return min;
    }
}