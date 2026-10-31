class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0, left = 0;

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }

            max = Math.max(max, i - left + 1);
            map.put(ch, i);
        }

        return max;
    }
}