class Solution {
    public int hammingWeight(int n) {
        int total = 32;
        int c = 0;
        for(int bs = 0; bs<total; bs++){
            int mn = 1<<bs;
            if((n & mn) != 0) c++;
        }
        return c;
    }
}