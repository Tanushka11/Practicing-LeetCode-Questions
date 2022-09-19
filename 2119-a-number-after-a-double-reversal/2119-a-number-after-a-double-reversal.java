class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = reverse(num);
        int or = reverse(rev);
        return num == or;
    }
    int reverse(int x){
        int ans = 0;
        while(x > 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        return ans;
    }
}