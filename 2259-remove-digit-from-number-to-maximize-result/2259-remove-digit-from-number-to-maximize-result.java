class Solution {
    public String removeDigit(String num, char digit) {
        for(int i=1;i<num.length();i++){
            if(num.charAt(i-1)==digit){
                if(num.charAt(i)>num.charAt(i-1)){
                    return num.substring(0,i-1) + num.substring(i);
                }
            }
        }
        int LastIndexOfDigit= num.lastIndexOf(digit);
        return num.substring(0,LastIndexOfDigit) + num.substring(LastIndexOfDigit + 1);
    }
}