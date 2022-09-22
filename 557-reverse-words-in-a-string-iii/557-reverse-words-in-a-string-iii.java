class Solution {
    public static String reverse(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        int l=str.length;
        String res="";
        for(int i=0;i<l;i++){
                res+=reverse(str[i])+" ";
            }
        
        return res.trim();
    }
}