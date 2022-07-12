import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int s=0;
int n=nums.length;
Map<Integer,Integer> map=new HashMap<>();
for(Integer nu:nums)
map.put(nu,map.getOrDefault(nu,0)+1);
Iterator it = map.keySet().iterator();
while(it.hasNext())
{
int key=(int)it.next();
if(map.get(key)>n/2)
s=key;
}
return(s);
    }
}