class Solution:
    def reverse(self, x: int) -> int:

        if(x>=0):
            reversed_num=int(str(x)[::-1])
        else:
            reversed_num=-1*int(str(-1*x)[::-1])

        if abs(reversed_num) > -2**31 and abs(reversed_num) < 2**31 - 1:
            return reversed_num
        else:
            return 0 