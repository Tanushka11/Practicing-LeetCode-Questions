public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        System.out.print(n);
        int i = 0;
        int j = 31;
        while(i<j){
            int mi = 1 << i;
            int mj = 1 << j;
            
            if((n & mi) == 0 && ((n & mj) != 0)){
                n = n | mi;
                int mn = ~(1 << j);
                n = n & mn;
              
            }
            else if((n & mi) != 0 && ((n & mj) == 0)){
                n = n | mj;
                int mn = ~(1 << i);
                n = n & mn;
                
            }
              i++;
              j--;
        }
        return n;
    }
}