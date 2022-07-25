class Solution {
    public int search(int[] nums, int target) {
  /*      int result=-1;
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                result=mid;
            }
            else if( target<nums[mid] && !(nums[mid+1]>nums[mid]) ){
                high=mid-1;
            }
          else if( target<nums[mid] && nums[mid+1]>=nums[mid] ){
                low=mid+1;
            }  
          else if( target>nums[mid] &&  !(nums[mid+1]<nums[mid]) ){
                low=mid+1;
            }
          else if( target>nums[mid] && nums[mid+1]<=nums[mid] ){
                high=mid-1;
            }  
        }
        return(result);   */
        
        int low = 0;
        int high = nums.length-1;

			while(low<=high){
				int mid = low +(high-low)/2;
				if(nums[mid]==target){ return mid; }
				if(nums[mid]>=nums[low]){
					if(target<=nums[mid] && target>=nums[low]){
						high = mid-1;
					}
					else{
						low = mid+1;
					}
				}
				else{
					if(target>=nums[mid] && target<=nums[high]){
						low = mid+1;
					}
					else{
						high = mid-1;
					}
				}
			}
			return -1;
    }
}