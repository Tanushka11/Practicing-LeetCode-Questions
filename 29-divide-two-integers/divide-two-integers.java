class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
       if(dividend == divisor) return 1;
       Boolean sign = true;
       if(dividend <= 0 && divisor > 0 ) sign = false;
       if(dividend >= 0 && divisor < 0 ) sign = false;

       long n = Math.abs((long)dividend);
       long d = Math.abs((long)divisor);

       long ans = 0;
       while(n >= d){
        int count  = 0;
        //n >= d * math.pow(2, count+1);
           while(n > (d << (count+1))){
            count++;
           }
           ans = ans + (1 << count);
            n =  n - (d * (1 << count));
       }
       if(ans == 1<<31 && sign == true) return Integer.MAX_VALUE;
       if(ans == 1<<31  && sign == false) return Integer.MIN_VALUE;
       if(sign == false){
        return (int)ans * (-1);
       }
       return (int)ans;
    }
}