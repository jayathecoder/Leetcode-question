class Solution {
    static void dfs(int num,int n,int k,ArrayList<Integer> arr){
        if(n==0){
            arr.add(num);
            return;
        }
        int last_digit=num%10;
        if(k>0 &&last_digit+k<=9) dfs(num*10+last_digit+k,n-1,k,arr);
        if(last_digit>=k) dfs(num*10+last_digit-k,n-1,k,arr);
    }
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<10;i++){
            dfs(i,n-1,k,arr);
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
}