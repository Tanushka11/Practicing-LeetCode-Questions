
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }
    int findsquare(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n/10;
        }
        return sum;
    }
}