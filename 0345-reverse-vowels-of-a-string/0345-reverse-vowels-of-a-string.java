class Solution {
    public String reverseVowels(String s) {
//         if(s=="" || s.length()==1) return s;
        
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//                 st.push(ch);
//             }
//         }
//         String result="";
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//                 result+=st.pop();
//             else
//                 result+=ch;
//         }
//         return result;
         char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left]))
                left++;
            while (left < right && !isVowel(chars[right]))
                right--;

            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
        return new String(chars);
    }
     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}