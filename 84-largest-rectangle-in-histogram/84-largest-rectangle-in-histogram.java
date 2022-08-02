class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int area=0;int curr,tp;
        int n=heights.length;
        for(int i=0;i<heights.length;i++){
            while(s.isEmpty()==false && heights[s.peek()]>=heights[i]){
                 tp=s.pop();
                curr=heights[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                area=Math.max(curr,area);
            }
            s.push(i);
        }
        while(s.isEmpty()==false){
            tp=s.pop();
            curr=heights[tp]*(s.isEmpty()?n:(n-s.peek()-1));
            area=Math.max(area,curr);
        }
        return area;
    }
}