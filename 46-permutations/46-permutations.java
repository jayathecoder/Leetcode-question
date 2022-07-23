class Solution {
    
    
  /*  public static void permutations(int[] nums,boolean[] check,List<Integer> ds,List<List<Integer>> result){
        
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
        
        */
    
     private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            // copy the ds to ans
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> ans = new ArrayList < > ();
        recurPermute(0, nums, ans);
        return ans;
        
    }
}