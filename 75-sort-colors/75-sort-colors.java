class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int mid = 0;
        int high = nums.length -1;
        
        while(mid <= high) {
            switch(nums[mid]) {
                case 0:
                    swap(lo,mid,nums);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(high,mid,nums);
                    high--;
                    break;
            }
        }
    }
    
    public static void swap(int val1, int val2 , int nums[]) {
        int temp = nums[val1];
        nums[val1] = nums[val2];
        nums[val2] = temp;
    }
}    
    