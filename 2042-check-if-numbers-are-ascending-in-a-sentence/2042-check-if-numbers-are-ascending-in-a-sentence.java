class Solution {
    public boolean areNumbersAscending(String s) {
        int previousN = 0;
          
        String[] arr = s.split(" ");
         
          for(int i=0; i<arr.length; i++){
              if(Character.isDigit(arr[i].charAt(0))){
                 int CurrNum = Integer.parseInt(arr[i]);
                   if(CurrNum <= previousN){
                     return false;
                 }
                    previousN = CurrNum;
              }
            
    }
        return true;
}
                 }