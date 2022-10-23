class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int result[]=new int[2];
        int temp[]=new int[n+1];
        for(int i=0;i<n;i++){
            temp[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(temp[i]==2){
                result[0]=i;
            }
        }
        for(int i=1;i<=n;i++)
            if(temp[i]==0) result[1]=i;
        return result;
    }
}