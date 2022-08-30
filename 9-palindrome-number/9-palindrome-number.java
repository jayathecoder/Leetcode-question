class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0,d;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==x) return true;
        else return false;
    }
}