class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=nums2.length-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(!st.isEmpty())
                    map.put(nums2[i],st.peek());
                else
                    map.put(nums2[i],-1);
                st.push(nums2[i]);
        }
        int result[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}