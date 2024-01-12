class Solution {
    public String largestOddNumber(String num) {
       
        if(Character.getNumericValue(num.charAt(num.length()-1)) % 2 != 0){
            return num;
        }
        for(int i = num.length() - 1; i>0; i--){
            String s = num.substring(0,i);

            int x = Character.getNumericValue(s.charAt(s.length()-1));
            if(x % 2 != 0 ){
                return s;
            }
        }

        return "";
    }
}