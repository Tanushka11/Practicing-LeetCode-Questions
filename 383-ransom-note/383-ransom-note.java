class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] allCh= new int[26];
        if(ransomNote.length()>magazine.length()){
         return false;
        }
        for(char c : magazine.toCharArray()){
            allCh[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(allCh[c-'a']==0){
                return false;
            }
            else{
               allCh[c-'a']--; 
            }
        }
        return true;
    }
}