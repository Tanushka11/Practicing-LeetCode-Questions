class Solution {
    private long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5,even) % MOD;
        long second = pow(4, odd) % MOD;
        return (int) (first * second % MOD);
    }
    private long pow(long x, long n){
        if(n == 0){
            return 1;
        }
        long half = pow(x,n/2) % MOD;
        if(n % 2 == 0){
            return (half * half) % MOD;
        }
        else{
            return  (half * half * x) % MOD;
        }
    }
}