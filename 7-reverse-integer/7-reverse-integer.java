class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0 ){
            int rem = x % 10;
            int NewAns = ans * 10 + rem;
            if((NewAns - rem) / 10 != ans){
                return 0;
            }
            ans = NewAns;
            x /= 10;
        }
        return ans;
    }
}