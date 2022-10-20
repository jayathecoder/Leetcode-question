class Solution {
    public String intToRoman(int num) {
          char[] symbole = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] value = new int[] { 1, 5, 10, 50, 100, 500, 1000 };
        int[] q = new int[7];
        
        String answer = "";
        
        for (int i = 6; i >= 0; i -= 2) {
            int tmp = num / value[i];
            if (5 <= tmp && tmp <= 8) {
                q[i + 1]++;
                q[i] = tmp - 5;
            }
            else q[i] = tmp;
            num %= value[i];
        }
        
        for (int i = 6; i >= 0; i--) {
            if (q[i] == 9) {
                answer += symbole[i];
                answer += symbole[i + 2];
            }
            else if (q[i] == 4) {
                answer += symbole[i];
                answer += symbole[i + 1];
            }
            else if (1 <= q[i] && q[i] <= 3) {
                for (int j = 0; j < q[i]; j++) {
                    answer += symbole[i];
                }
            }
        }
        
        return answer;
    }
}