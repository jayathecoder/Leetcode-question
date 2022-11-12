class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.add(n);
        }
        int max=0;
        while(k!=0){
            max=pq.poll();k--;
        }
        return max;
    }
}