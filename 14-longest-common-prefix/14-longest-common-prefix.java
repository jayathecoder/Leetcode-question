class Solution {
    public int findMinLength(String strs[]){
        int min=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min) min=strs[i].length();
        }
        return min;
    }
    public String longestCommonPrefix(String[] strs) {
        int minLength=findMinLength(strs);
        String result="";
        
        for(int i=0;i<minLength;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch) return result;
            }
            result+=ch;
        }
        return result;
    }
}