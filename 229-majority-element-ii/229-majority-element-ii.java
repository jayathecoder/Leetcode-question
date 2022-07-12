class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap < Integer, Integer > mp = new HashMap < > ();
    ArrayList < Integer > ans = new ArrayList < > ();
        int n=arr.length;

    for (int i = 0; i < n; i++) {
      mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
    }

    for (int x: mp.keySet()) {
      if (mp.get(x) > (n / 3))
        ans.add(x);
    }

    return ans;
    }
}