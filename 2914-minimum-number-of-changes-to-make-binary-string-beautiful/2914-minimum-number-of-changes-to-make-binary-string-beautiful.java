class Solution {
    public int minChanges(String s) {
        int prevChar=s.charAt(0);
        int minChanges =0;
        int currSubstringLength=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(prevChar == ch){
                currSubstringLength++;
            }
            else if(currSubstringLength%2==0){
                currSubstringLength=1;
            }
            else{
                minChanges++;
                currSubstringLength++;
            }
            prevChar=ch;
        }
        return minChanges;
    }
}