import java.util.*;
class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            arr.add(i);
        }
        arr.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+arr.get(k/fact);
            arr.remove(k/fact);
            if(arr.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/arr.size();
        }
        return ans;
    }
}