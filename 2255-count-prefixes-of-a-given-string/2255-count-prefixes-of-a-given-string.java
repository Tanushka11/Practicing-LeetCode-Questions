class Solution {
    public int countPrefixes(String[] words, String s) {
       int count =0;
        for(String pr : words){
            if(s.startsWith(pr)){
                count ++;
            }
        }
        return count;
        
    }
}