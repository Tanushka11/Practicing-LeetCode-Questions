class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;

        for(int i = 2; i*i < n; i++){
            for(int j = i*i; j<n; j += i){
                primes[j] = false;
            }
        }
        int c = 0;
        for(boolean i : primes){
            if(i == true){
                c++;
            }
        }
        return c;
    }
}