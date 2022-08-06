class Solution {
    public boolean isSubsequence(String s, String t) {
       if(t.length()<s.length())
        return false;
    
    if(s.length()==0)
        return true;
    
    char[] charArray= s.toCharArray();
   
    int j=0;
    int flag=0;
    
    //loop through each char of bigger string
    for(int i=0; i<t.length();i++){
        if(t.charAt(i)==charArray[j]){ 
            //if char matches then increment flag and index for smaller string
            flag++; 
            j++;
            
        //break loop when smaller string is reached to end
        if(j==s.length())
            break;
        }
    }
    return (flag==s.length()); //found all char in bigger string so return true
    }
}