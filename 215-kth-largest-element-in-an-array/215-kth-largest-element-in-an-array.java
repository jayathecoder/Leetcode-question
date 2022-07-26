import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
int m=k;
if(k==0){
return -1;
}
if(nums.length==1){
return nums[0];
}
for(int i=0;i<k;i++){
pq.add(nums[i]);
}
for(int i=k;i<nums.length;i++){
if(pq.peek() < nums[i]){
pq.remove();
pq.add(nums[i]);
}
}
return pq.peek();
    }
}