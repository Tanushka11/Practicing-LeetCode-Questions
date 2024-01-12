class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        // String ans = "";
        // string is giving O(n) tc thus use string builder
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>0; i--){
            if(!words[i].isEmpty()){
               sb.append(words[i]);
               sb.append(" ");
            }
        }
         sb.append(words[0]);
        return sb.toString();
    }
}