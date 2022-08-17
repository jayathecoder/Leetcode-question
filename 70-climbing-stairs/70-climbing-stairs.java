class Solution {
    
    int helper(int n,HashMap<Integer,Integer> map){
        if(n==1) return 1;
        if(n==2) return 2;
        if(map.containsKey(n)) return map.get(n);
        int x=helper(n-1,map)+helper(n-2,map);
        map.put(n,x);
        return x;
        
    }
    
    public int climbStairs(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=helper(n,map);
        return result;
        
    }
}