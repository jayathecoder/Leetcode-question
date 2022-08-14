import java.util.*;
class Solution {
     
    public int fib(int n) {
       HashMap<Integer,Integer> map=new HashMap<>();
        return evaluate(n,map);
    }
    
    int evaluate(int n,HashMap<Integer,Integer> map){
        if(n==0 || n==1) return n;
        if(map.containsKey(n)==true) 
            return map.get(n);
        
        int x=(evaluate(n-1,map)+evaluate(n-2,map));
        map.put(n,x);
        return x;
    }
}