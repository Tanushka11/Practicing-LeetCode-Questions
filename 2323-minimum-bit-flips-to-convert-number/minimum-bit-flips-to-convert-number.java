class Solution {
    public int minBitFlips(int n, int k) {
        if(n == k) return 0;
        int x = k;
        int count = 0;
        int total = 32;
        for(int bp = 0; bp < total; bp++){
            if(!equal(bp , n , k)){
                count++;
            }
        }
         return count;
    }
    Boolean equal(int p, int n , int k){
        int mn = 1 << p;
        if((n & mn) == 0 && (k & mn) == 0) return true;
        if((n & mn) != 0 && (k & mn) != 0) return true;
        return false;
    }
}