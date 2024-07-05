class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
       
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                five += 5;
            }else if(bills[i] == 10 && five >= 5){
                ten += 10;
                five -= 5;
            }else if(bills[i] == 20){
                if(ten >= 10 && five >= 5){
                    
                    ten -= 10;
                    five -= 5;
                }else if(five >= 15){
                    five -= 15;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}