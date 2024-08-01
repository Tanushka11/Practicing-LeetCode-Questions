class Solution {
    // get all the prime numbers with in the range of square root of r because all the squares of those
    // prime will be proper diviser 
    // ans will be total - count of proper divisor
    public ArrayList<Integer> countPrimes(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i<n; i++){
             if(isPrime[i] == true){
                for(int j = i*i ; j<n; j+=i){
                    isPrime[j] = false;
                }
             }
        }
        for(int i = 2; i<n; i++){
             if(isPrime[i] == true){
                primes.add(i);
             }
        }
        return primes;
    }
    public int nonSpecialCount(int l, int r) {
        int total = (r - l) + 1;
        int count = 0;
        int limit = (int)Math.sqrt(r);
        ArrayList<Integer> primes = countPrimes(limit+1);
        for(int i = 0; i < primes.size(); i++){
            int pd = primes.get(i)* primes.get(i);
            if(pd <= r && pd >= l){
                count++;
            }
        }
        return total - count;
    }
}