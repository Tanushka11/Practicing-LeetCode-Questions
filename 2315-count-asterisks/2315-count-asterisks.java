class Solution {
    public int countAsterisks(String s) {
        boolean bars=false;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
               bars=!bars;
            }
            if(!bars && s.charAt(i)=='*'){
                count ++;
            }
            
        }
        return count;
    }
}