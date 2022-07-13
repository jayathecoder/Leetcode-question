class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list = new LinkedList();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++) {
            
            if(i > 0 && nums[i]==nums[i-1]) {
                continue;
            }
            
                for(int j = i+1; j < nums.length - 2; j++) {
                
                if(j > i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                
                int low = j + 1;
                int high = nums.length - 1;
                
                while (low < high) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[low] + (long)nums[high];
                    if(sum == (long)target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low < nums.length - 1 && nums[low]==nums[low+1]) low++;
                        while(high > 0 && nums[high] == nums[high-1])high--;
                        low++;
                        high--;
                    }
                    else if(sum > (long)target) {
                        high--;
                    }
                    else {
                        low++;
                    }
                }
            }
        }
        return list;
    }
}