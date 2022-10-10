class Solution {
    public String breakPalindrome(String palindrome) {
           if(palindrome.length() < 2) return "";
        char[] s = palindrome.toCharArray();

        for(int i = 0; i < s.length / 2; ++i) {
            if(s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        // if control reaches here, it means palindrome string had all 'a' chars
        s[s.length - 1] = 'b';
        return String.valueOf(s);
    }
}