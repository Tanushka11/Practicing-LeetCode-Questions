class Solution {
    public List<String> commonChars(String[] words) {
       List<String> commonChars= new ArrayList<>();
       int[] minFreq = new int[26];
       Arrays.fill(minFreq, Integer.MAX_VALUE);

       for(String currString : words){
           int[] charFreq = new int[26];
           for(char c : currString.toCharArray()){
               charFreq[c - 'a']++;
           }
           for(int i = 0; i < 26; i++){
               minFreq[i] = Math.min(minFreq[i] , charFreq[i]);
           }
       }
       for(int i = 0; i<26; i++){
           while(minFreq[i] > 0){
               commonChars.add("" + (char)(i+'a'));
               minFreq[i]--;
           }
       }
       return commonChars;
    }

}