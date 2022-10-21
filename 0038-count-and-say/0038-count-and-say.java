class Solution {
    public String countAndSay(int n) {
          StringBuilder currStr = new StringBuilder("1");

        for (int k = 0; k < n - 1; k++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1; i < currStr.length(); i++) {
                if (currStr.charAt(i) == currStr.charAt(i - 1)) count++;
                else{
                    sb.append(count).append(currStr.charAt(i - 1));
                    count = 1;
                }
            }
            sb.append(count).append(currStr.charAt(currStr.length()-1));
            currStr = sb;
        }
        return currStr.toString();
    }
}