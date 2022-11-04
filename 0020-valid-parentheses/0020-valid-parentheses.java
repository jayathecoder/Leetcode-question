class Solution {
    public static boolean isCheck(char a,char b){
        return((a=='('&& b==')')||(a=='{'&& b=='}')||(a=='['&& b==']'));
    }
    
    public boolean isValid(String str) {
       Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()) return false;
                else if(isCheck(s.peek(),ch)==false) return false;
                else s.pop();
            }
        }
        return (s.isEmpty()==true);
    }
}