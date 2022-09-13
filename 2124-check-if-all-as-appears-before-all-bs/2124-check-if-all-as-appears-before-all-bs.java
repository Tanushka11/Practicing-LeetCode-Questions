class Solution {
    public boolean checkString(String s) {
        String sb = new String();
        for(int i=0; i<s.length(); i++){
         
         if( s.charAt(i)!= 'a'){
           
            sb = s.substring(i);
             break;
         }
           
        }
        if(sb.contains("a")){
            return false;
        }
        return true;
    }
}