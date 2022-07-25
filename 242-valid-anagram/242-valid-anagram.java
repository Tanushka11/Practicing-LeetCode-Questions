class Solution {
    public boolean isAnagram(String s, String t) {
       if(t.length() != s.length() ){
           return false;
           }
        int n =  t.length();
         int[] letters = new int[26];
        for(int i=0 ; i<n ; i++){
         letters[s.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<n ; i++){
         letters[t.charAt(i) - 'a']--;
        }
         for(int i=0 ; i<26 ; i++) {
             if(letters[i]!=0){
                 return false;
             }
         }
        return true;
    }
}