class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i<=n; i++){
            ans[i] = countBit(i);
        }
        return ans;
    }
    int countBit(int n){
        int total = 32;
        int c = 0;
        for(int i = 0; i<total; i++){
            int mn = 1 << i;
            if((n & mn) != 0) c++;
        }
        return c;
    }
}