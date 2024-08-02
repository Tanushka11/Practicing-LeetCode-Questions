class Solution {
    public int minChanges(int n, int k) {
        if(n == k) return 0;
        int x = k;
        int count = 0;
        int total = 32;
        for(int bp = 0; bp < total; bp++){
            if(!equal(bp , n , k)){
                count++;
                int mn = ~(1<<bp);
                n = n & mn;
                k = k & mn;
            }
        }
        System.out.println(n);
        System.out.println(k);
        if(n == x) return count;
        return -1;
    }
    Boolean equal(int p, int n , int k){
        int mn = 1 << p;
        if((n & mn) == 0 && (k & mn) == 0) return true;
        if((n & mn) != 0 && (k & mn) != 0) return true;
        return false;
    }
}