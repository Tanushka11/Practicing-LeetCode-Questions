class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numDays = 0;
        if(month == 1){
            return day;
        }
        for(int i=0; i<month-1;i++){
            if(isLeap(year) && i == 1){
                numDays += days[1] +1;
                continue;
            }
            numDays += days[i];
        }
        return day+numDays;
    }
    boolean isLeap(int year){
        
        if(year%400 == 0){
            return true;
        }
        if(year%100 == 0){
            return false;
        }
        if(year%4 == 0){
            return true;
        }
        return false;
    }
}