class Solution {
    public int secondHighest(String s) {
       int max = -1;
       int secMax = -1;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int v =  Character.getNumericValue(ch);
                if(v > max){
                     secMax = max;
                    max = v;
                }
                if(v < max && v > secMax) {
                    secMax = v;
                }
            }
        }
        return secMax;
    }
}