class Solution {
   List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,0,0,"");
        return list;
    }
    private void helper(int n,int oc,int cc,String str){
        if(oc==n && cc==n) {
            list.add(str);
            return;
        }
        if(oc<n){
            helper(n,oc+1,cc,str+'(');
        }
        if(oc >cc){
            helper(n,oc,cc+1,str+')');
        }
    }
}