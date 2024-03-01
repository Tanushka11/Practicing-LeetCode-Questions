class Solution {
    public double myPow(double x, int nn) {
        double ans = 1;
        long n = nn;
        if(nn < 0){
            n = -n;
        }
        while(n>0){
            if(n % 2 == 0){
                n = n/2;
                x = x * x;
            }else{
                n = n - 1;
                ans = ans * x;
            }
        }
        if(nn < 0) return 1.0/ ans;
        return ans;
    }
}