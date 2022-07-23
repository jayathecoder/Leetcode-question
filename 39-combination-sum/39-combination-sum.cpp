class Solution {
    
public:
    void func(int ind,vector<int>& candidates,vector<vector<int>>& ans,vector<int>& ds,int target){
        if(ind==candidates.size()){
            if(target==0)
                ans.push_back(ds);
            return;
        }
        
        if(candidates[ind]<=target){
            ds.push_back(candidates[ind]);
        func(ind,candidates,ans,ds,target-candidates[ind]);
        ds.pop_back();
        }
        
        func(ind+1,candidates,ans,ds,target);
        
    }
    
    
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> ds;
        func(0,candidates,ans,ds,target);
        return ans;
        
    }
};