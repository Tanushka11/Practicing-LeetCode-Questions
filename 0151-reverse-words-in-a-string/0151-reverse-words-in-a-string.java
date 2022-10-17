class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split("\\s+");
        String ans  = "";
        
       for(int i=words.length - 1; i>0; i--)
       {
          ans +=words[i];
           ans += " ";
       }
        ans+=words[0];
        
        return ans;
    }
}