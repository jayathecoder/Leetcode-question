class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char a1[]=s.toCharArray();//approach 1 takes O(nlogn)
        Arrays.sort(a1);
        s=new String(a1);
        char a2[]=t.toCharArray();
        Arrays.sort(a2);
        t=new String(a2);
        if(s.equals(t)) return true;
        else return false;
    }//approach 2 will take O(n) which is to use frequency array
}