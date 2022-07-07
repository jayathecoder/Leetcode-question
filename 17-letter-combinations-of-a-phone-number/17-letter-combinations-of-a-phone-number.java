class Solution {
		public List<String> letterCombinations(String digits) {
			List<String> ans = new ArrayList<>();
			int len = digits.length();
			if(len == 0) return ans;

			String mp[] = {"","","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz" };
			String output ="";
			combination(digits,output,0,ans,mp,len);
			return ans;
		}

		void combination(String digit, String output,int index, List<String> ans, String mp[], int len){
			if(index >= len){
				ans.add(output);
				return;
			}
			int number = digit.charAt(index) - '0';
			String value= mp[number];
			for(int i=0; i<value.length(); i++){
				output += value.charAt(i);
				combination(digit,output,index+1,ans,mp,len);

				output = output.substring(0, output.length() - 1) ;
			}
		}
	}