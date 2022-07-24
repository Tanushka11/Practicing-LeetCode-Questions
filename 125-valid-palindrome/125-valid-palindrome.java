class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length() - 1 ; 
        
        
        while(start < end){
            char c1 = s.charAt(start);
        char c2 = s.charAt(end);
        
          if(!Character.isLetterOrDigit(c1)){
              start++;
          } 
          else if (!Character.isLetterOrDigit(c2)){
              end--;
          }  
          else{
          
         if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
            return false;
        }
            else{
                start++;
                end--;
            }
        }
        }
            
        return true;
    }
}