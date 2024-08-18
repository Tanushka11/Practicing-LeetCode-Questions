class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left; i <= right; i++){
            if(setBitsPrime(i)) c++;
        }
        return c;
    }
    boolean setBitsPrime(int n){
        int total = 32;
        int c = 0;
        for(int bs = 0; bs<total; bs++){
            int mn = 1 << bs;
            if((n & mn) != 0) c++;
        }
        if(c == 1) return false;
        for(int i = 2; i < c; i++){
            if(c % i == 0) return false;
        }
        return true;
    }
}