class Solution {
    public int characterReplacement(String s, int k) {
         int []fmap = new int[26];
        
        int res = 0, mostFrequent = 0, len = s.length(), start = 0;
        for(int end = 0 ; end < len; end++){
            mostFrequent = Math.max(mostFrequent, ++fmap[s.charAt(end) - 'A']);
           
            while(end - start + 1 - mostFrequent > k){
              fmap[s.charAt(start) - 'A']--;
                start++;
            }
            res = Math.max(res,end-start + 1);
            
        }
        return res;
    }
}