
class Solution {
    static final int CHAR=256;
    boolean areAnagram(String s1,String s2){
        int count[]=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        for(int i=0;i<=n-m;i++){
            if(areAnagram(s.substring(i,i+m),p)){
                result.add(i);
            }
        }
        return result;
    }
}