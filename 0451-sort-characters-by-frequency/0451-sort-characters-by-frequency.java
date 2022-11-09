
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String result="";
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            pq.add(m);
        }
        while(!pq.isEmpty()){
            int count=pq.peek().getValue();
            for(int i=0;i<count;i++)
                result+=pq.peek().getKey();
            pq.poll();
        }
        return result;
    }
}