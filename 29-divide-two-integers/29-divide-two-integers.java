class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE ;
        boolean ifNegative = dividend < 0 ^ divisor < 0  ;
        int quotient = 0 ;
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        while(dividend - divisor >= 0)
        {
            int j = 0 ;
            while(dividend - (divisor << j << 1) >= 0)
                j++;
            
            quotient += 1 << j ;
            dividend -= divisor << j ;
        }
        return ifNegative ? -quotient : quotient ;
    }
}