class Solution {
    public int maximum69Number (int num) {
        char ar[] = String.valueOf(num).toCharArray(); //converting num to character array

	for(int i =0;i<ar.length;i++){     //traversing from left to right if there is any 6 replace it with 9 and break
        if(ar[i]=='6'){                        
			ar[i]='9';
            break;
        }
        
    }
	return Integer.parseInt(new String(ar));      // parsing char array to int 
    }
}