class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:s.toCharArray())
           map.put(c,map.getOrDefault(c,0)+1);
        
        int result=0;
        boolean odd_found=false;
        for(int n:map.values()){
            if(n%2==0)
                result+=n;
            else{
                odd_found=true;
                result+=n-1;
            }
        }
        if(odd_found) result++;
        return result;
    }
}