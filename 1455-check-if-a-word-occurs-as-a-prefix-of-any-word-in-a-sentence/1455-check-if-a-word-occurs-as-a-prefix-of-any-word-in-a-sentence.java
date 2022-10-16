class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] words = sentence.split(" ");
        
        for(int i=0;i<words.length;i++)
        {
            int len = words[i].length();
            if(len >= searchWord.length()){
                String sub = words[i].substring(0,searchWord.length());
                if(sub.equals(searchWord)){
                      return i+1;
                }
            }
        }
        return -1;
    }
}