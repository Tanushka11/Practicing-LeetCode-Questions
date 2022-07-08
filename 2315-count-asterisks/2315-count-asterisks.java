class Solution {
    public int countAsterisks(String s) {
        int bars=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
             bars++;
            }
            if(bars%2==0 && s.charAt(i)=='*'){
                count ++;
            }
            
        }
        return count;
    }
} 