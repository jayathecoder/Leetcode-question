import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
   /*     for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }  */
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        
        return result;
    }
}