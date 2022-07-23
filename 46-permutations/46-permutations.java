class Solution {
    
    
    public static void permutations(int[] nums,boolean[] check,List<Integer> ds,List<List<Integer>> result){
        
        if(ds.size()==nums.length){
            result.add(new ArrayList(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                check[i]=true;
                ds.add(nums[i]);
                permutations(nums,check,ds,result);
                ds.remove(ds.size()-1);
                check[i]=false;
            }
        }
        
    }
    
    
    

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean check[]=new boolean[nums.length];
        permutations(nums,check,ds,result);
        
        return result;
        
    }
}