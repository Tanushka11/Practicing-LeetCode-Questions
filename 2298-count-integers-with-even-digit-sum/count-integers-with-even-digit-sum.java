class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 1; i<=num; i++){
            if(isSumEven(i)){
                count++;
            }
        }
        return count;
    }
    Boolean isSumEven(int n){
        if(n < 10 && isEven(n)) return true;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        if(sum != 0 && isEven(sum)){
            return true;
        }
        return false;
    }
    Boolean isEven(int n){
        if(n % 2 == 0) return true;
        return false;
    }
}