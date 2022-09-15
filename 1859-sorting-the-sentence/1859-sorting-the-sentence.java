class Solution {
    public String sortSentence(String s) {
        String [] arr = s.split(" ");
        String [] words = new String[arr.length];
        StringBuilder ans = new StringBuilder();
        
        int i =0;
        for(String word : arr){
            i = (int)(word.charAt(word.length() - 1) - '0');
            
            words[i-1] = word.substring(0,word.length() - 1);
            
        }
        for(int j=0; j<words.length-1; j++){
            ans.append(words[j]).append(" ");
        }
       ans.append(words[words.length - 1]);
        return ans.toString();
    }
}