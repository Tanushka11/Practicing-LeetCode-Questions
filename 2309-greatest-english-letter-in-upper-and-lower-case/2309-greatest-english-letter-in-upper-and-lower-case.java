class Solution {
    public String greatestLetter(String s) {
        int[] lc= new int[26];
        int[] uc= new int[26];
        String ans="";
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>='A' &&s.charAt(i)<='Z' ){
               uc[s.charAt(i)-'A']=1;
           }
           else{
               lc[s.charAt(i)-'a']=1;
           }
       }
        for(int i=25;i>=0;i--){
            if(lc[i]>0 && uc[i]>0){
              ans += (char)(i+'A');
                break;
            }
        }
           return ans; 
        }
    }
