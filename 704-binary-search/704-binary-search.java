class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid;
        while(r>=l){
          mid=l+(r-l)/2;
            if(nums[mid]==target)
                return(mid);
            else if(target>nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return(-1);
    }
}